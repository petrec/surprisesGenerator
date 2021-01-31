package curs13ShareSurprises;

public interface IBag {

	// adds a surprise in the bag
	void put(ISurprise newSurprise);

	// add all the surprises from another IBag
	// -> the "bagOfSurprise" will be empty() afterwards
	void put(IBag bagOfSurprise);

	// remove a surprise from the bag and returns it
	ISurprise takeOut();

	// check if the bag is empty or not
	boolean isEmpty();

	// returns the number of surprises
	int size();

	// display the surprises
	void displayBag();
}
