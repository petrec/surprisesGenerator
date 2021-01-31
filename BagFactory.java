package curs13ShareSurprises;

public class BagFactory implements IBagFactory {

	@Override
	public IBag makeBag(String type) {
		if (type.equalsIgnoreCase("random")) {
			return new RandomBag();

		} else if (type.equalsIgnoreCase("fifo")) {
			return new FIFOBag();

		} else if (type.equalsIgnoreCase("lifo")) {
			return new LIFOBag();
		}
		return null;
	}
}
