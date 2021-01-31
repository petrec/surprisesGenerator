package curs13ShareSurprises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class FortuneCookie implements ISurprise {
	private static final ArrayList<String> sayings = new ArrayList<String>(
			Arrays.asList("Few are those who see with their own eyes and feel with their own hearts.",
					"Unthinking respect for authority is the greatest enemy of truth.",
					"Try not to become a man of success, but rather try to become a man of value.",
					"Great spirits have always encountered violent opposition from mediocre minds.",
					"I would teach peace rather than war. I would inculcate love rather than hate.",
					"Look deep into nature, and then you will understand everything better.",
					"All religions, arts and sciences are branches of the same tree.",
					"A man should look for what is, and not for what he thinks should be.",
					"The most beautiful experience we can have is the mysterious.",
					"I believe in standardizing automobiles. I do not believe in standardizing human beings.",
					"A table, a chair, a bowl of fruit and a violin; what else does a man need to be happy?",
					"A human being is part of a whole called by us “Universe.”",
					"The important thing is to not stop questioning. Curiosity has its own reason for existing.",
					"A question that sometimes drives me hazy — am I or are the others crazy?",
					"Life is like riding a bicycle. To keep your balance you must keep moving.",
					"The important thing is not to stop questioning. Curiosity has its own reason for existence.",
					"I have no special talent. I am only passionately curious.",
					"Science can flourish only in an atmosphere of free speech.",
					"A happy man is too satisfied with the present to dwell too much on the future.",
					"The great moral teachers of humanity were, in a way, artistic geniuses in the art of living."));
	private String symbolicMessage;

	public FortuneCookie(String symbolicMessage) {
		this.symbolicMessage = symbolicMessage;
	}

	public String getSymbolicMessage() {
		return symbolicMessage;
	}

	public static FortuneCookie generate() {
		Random random = new Random();
		int randomNumber = random.nextInt(20);
		FortuneCookie fortuneCookie = new FortuneCookie(sayings.get(randomNumber));

		return fortuneCookie;
	}

	@Override
	public void enjoy() {
		System.out.println("FORTUNE COOKIE: " + this.symbolicMessage);
	}
}