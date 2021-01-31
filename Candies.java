package curs13ShareSurprises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Candies implements ISurprise {
	private static final ArrayList<String> candyType = new ArrayList<String>(Arrays.asList("chocolate", "jelly", "fruits", "vanilla"));
	private int numberOfCandies;
	private String type;

	public Candies(int numberOfCandies, String type) {
		this.numberOfCandies = numberOfCandies;
		this.type = type;
	}

	public int getNumberOfCandies() {
		return numberOfCandies;
	}

	public String getType() {
		return type;
	}

	public static Candies generate() {
		Random random = new Random();
		int typeOfCandy = random.nextInt(4);
		int numberOfCandies = random.nextInt(9) + 1;
		Candies candies = new Candies(numberOfCandies, candyType.get(typeOfCandy));
		return candies;
	}

	@Override
	public void enjoy() {
		System.out.println("CANDIES: The " + this.numberOfCandies + " surprise candies are of the type: " + this.type);
	}
}