package curs13ShareSurprises;

import java.util.concurrent.TimeUnit;

public abstract class AbstractGiveSurprises {
	private IBag bag;
	private int waitTime;

	public AbstractGiveSurprises(String type, int waitTime) {
		IBagFactory bagFactory = new BagFactory();
		this.bag = bagFactory.makeBag(type);
		this.waitTime = waitTime;
	}

	public IBag getBag() {
		return this.bag;
	}

	public void put(ISurprise newSurprise) {
		this.bag.put(newSurprise);
	}

	public void put(IBag surprises) {
		this.bag.put(surprises);
	}

	public void give() {
		if (this.isEmpty()) {
			System.out.println("The Bag is empty!");
		} else {
			System.out.println("Eliminated surprise: ");
			this.bag.takeOut().enjoy();
			this.giveWithPassion();
		}
	}

	public void giveAll() {
		System.out.println("Eliminated surprises: ");
		if (this.isEmpty()) {
			System.out.println("The Bag is empty!");
		}
		while (!this.isEmpty()) {
			this.bag.takeOut().enjoy();
			this.giveWithPassion();
			try {
				TimeUnit.SECONDS.sleep(this.waitTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public boolean isEmpty() {
		return this.bag.isEmpty();
	}

	protected abstract void giveWithPassion();
}
