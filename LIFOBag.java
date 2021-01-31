package curs13ShareSurprises;

import java.util.ArrayList;

public class LIFOBag implements IBag {
	private ArrayList<ISurprise> lifoSurprisesBag = new ArrayList<ISurprise>();

	public ArrayList<ISurprise> getLifoSurprisesBag() {
		return lifoSurprisesBag;
	}

	@Override
	public void put(ISurprise newSurprise) {
		this.lifoSurprisesBag.add(newSurprise);
	}

	@Override
	public void put(IBag bagOfSurprise) {
		if (bagOfSurprise instanceof LIFOBag) {
			LIFOBag theOtherBag = (LIFOBag) bagOfSurprise;
			this.lifoSurprisesBag.addAll(theOtherBag.getLifoSurprisesBag());
			theOtherBag.getLifoSurprisesBag().clear();
		}
	}

	@Override
	public ISurprise takeOut() {
		return this.lifoSurprisesBag.remove(this.size() - 1);
	}

	@Override
	public boolean isEmpty() {
		if (this.lifoSurprisesBag.isEmpty()) {
			return true;
		}
		return false;
	}

	@Override
	public int size() {
		return this.lifoSurprisesBag.size();
	}

	@Override
	public void displayBag() {
		for (int i = this.lifoSurprisesBag.size() - 1; i >= 0; i--) {
			System.out.println("Surprise [" + (i + 1) + "] from LIFO List: ");
			this.lifoSurprisesBag.get(i).enjoy();
		}
	}
}
