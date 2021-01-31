package curs13ShareSurprises;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws Exception {
		System.out.println("--- Random Bag 1 ---");
		GiveSurpriseAndApplause giveSurpriseAndApplause1 = new GiveSurpriseAndApplause("random", 2);
		giveSurpriseAndApplause1.put(GatherSurprises.gather());
		giveSurpriseAndApplause1.put(GatherSurprises.gather());
		giveSurpriseAndApplause1.put(GatherSurprises.gather());
		giveSurpriseAndApplause1.put(GatherSurprises.gather());
		System.out.println("Size of the bag = " + giveSurpriseAndApplause1.getBag().size());
		giveSurpriseAndApplause1.getBag().displayBag();
		System.out.println();

		giveSurpriseAndApplause1.give();
		System.out.println();

		giveSurpriseAndApplause1.giveAll();
		System.out.println();

		System.out.println("--- Random Bag 2 ---");
		GiveSurpriseAndApplause giveSurpriseAndApplause2 = new GiveSurpriseAndApplause("random", 2);
		giveSurpriseAndApplause2.put(giveSurpriseAndApplause1.getBag());
		System.out.println("Size of the bag = " + giveSurpriseAndApplause2.getBag().size());
		giveSurpriseAndApplause2.getBag().displayBag();
		System.out.println();

		giveSurpriseAndApplause2.give();
		giveSurpriseAndApplause2.give();
		System.out.println();

		System.out.println("--- FIFO Bag 1 ---");
		GiveSurpriseAndSing giveSurpriseAndSing1 = new GiveSurpriseAndSing("fifo", 1);
		for (int i = 0; i < 10; i++) {
			giveSurpriseAndSing1.put(GatherSurprises.gather());
		}
		System.out.println("Size of the bag = " + giveSurpriseAndSing1.getBag().size());
		giveSurpriseAndSing1.getBag().displayBag();
		System.out.println();

		giveSurpriseAndSing1.give();
		System.out.println();

		System.out.println("Is the bag empty? " + giveSurpriseAndSing1.isEmpty());
		System.out.println("\n");

		System.out.println("--- LIFO Bag 1 ---");
		GiveSurpriseAndHug giveSurpriseAndHug = new GiveSurpriseAndHug("lifo", 2);
		for (int i = 0; i < 4; i++) {
			giveSurpriseAndHug.put(GatherSurprises.gather());
		}
		System.out.println("Size of the bag = " + giveSurpriseAndHug.getBag().size());
		giveSurpriseAndHug.getBag().displayBag();
		System.out.println();

		giveSurpriseAndHug.giveAll();
		System.out.println();

		System.out.println("Is the bag empty? " + giveSurpriseAndHug.isEmpty());

		ArrayList<ISurprise> surprises = GatherSurprises.gather(12);
		System.out.println();
		System.out.println(surprises.size());
		GiveSurpriseAndSing giveSurpriseAndSing2 = new GiveSurpriseAndSing("fifo", 1);
		for (int i = 0; i < surprises.size(); i++) {
			giveSurpriseAndSing2.put(surprises.get(i));
		}
		giveSurpriseAndSing2.getBag().displayBag();
	}
}