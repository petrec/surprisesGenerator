package curs13ShareSurprises;

import java.util.ArrayList;
import java.util.Random;

public class RandomBag implements IBag {
	private ArrayList<ISurprise> randomSurprisesBag = new ArrayList<ISurprise>();

	public ArrayList<ISurprise> getRandomSurprisesBag() {
		return this.randomSurprisesBag;
	}

	@Override
	public void put(ISurprise newSurprise) {
		this.randomSurprisesBag.add(newSurprise);
	}

	@Override
	public void put(IBag bagOfSurprise) {
		RandomBag theOtherBag = (RandomBag) bagOfSurprise;
		this.randomSurprisesBag.addAll(theOtherBag.getRandomSurprisesBag());
		theOtherBag.getRandomSurprisesBag().clear();
	}

	@Override
	public ISurprise takeOut() {
		if (this.isEmpty()) {
			return null;
		}
		if (this.randomSurprisesBag.size() >= 2) {
			Random random = new Random();
			int randomSurprise = random.nextInt(this.randomSurprisesBag.size());
			return this.randomSurprisesBag.remove(randomSurprise);
		}
		return this.randomSurprisesBag.remove(0);
	}

	@Override
	public boolean isEmpty() {
		if (this.randomSurprisesBag.isEmpty()) {
			return true;
		}
		return false;
	}

	@Override
	public int size() {
		return this.randomSurprisesBag.size();
	}

	@Override
	public void displayBag() {
		for (int i = 0; i < this.randomSurprisesBag.size(); i++) {
			System.out.println("Surprise [" + (i + 1) + "] from Random List: ");
			this.randomSurprisesBag.get(i).enjoy();
		}
	}
}
