package curs13ShareSurprises;

import java.util.ArrayList;

public class FIFOBag implements IBag {

	private ArrayList<ISurprise> fifoSurprisesBag = new ArrayList<ISurprise>();

	public ArrayList<ISurprise> getFifoSurprisesBag() {
		return this.fifoSurprisesBag;
	}

	@Override
	public void put(ISurprise newSurprise) {
		this.fifoSurprisesBag.add(newSurprise);
	}

	@Override
	public void put(IBag bagOfSurprise) {
		FIFOBag theOtherBag = (FIFOBag) bagOfSurprise;
		this.fifoSurprisesBag.addAll(theOtherBag.getFifoSurprisesBag());
		theOtherBag.getFifoSurprisesBag().clear();
	}

	@Override
	public ISurprise takeOut() {
		return this.fifoSurprisesBag.remove(0);
	}

	@Override
	public boolean isEmpty() {
		if (this.fifoSurprisesBag.isEmpty()) {
			return true;
		}
		return false;
	}

	@Override
	public int size() {
		return this.fifoSurprisesBag.size();
	}

	@Override
	public void displayBag() {
		for (int i = 0; i < this.fifoSurprisesBag.size(); i++) {
			System.out.println("Surprise [" + (i + 1) + "] from FIFO List: ");
			this.fifoSurprisesBag.get(i).enjoy();
		}
	}
}
