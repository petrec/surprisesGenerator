package curs13ShareSurprises;

import java.util.ArrayList;
import java.util.Arrays;

public class MinionToy implements ISurprise {
	private static final ArrayList<String> minions = new ArrayList<String>(Arrays.asList("Dave", "Carl", "Kevin", "Stuart", "Jerry", "Tim"));
	private String minionName;
	private static String lastMinion = minions.get(0);

	public MinionToy(String minionName) {
		this.minionName = minionName;
	}

	public String getMinionName() {
		return minionName;
	}

	public static MinionToy generate() {
		int count = minions.indexOf(lastMinion);
		if (count < minions.size() - 1) {
			MinionToy minionToy = new MinionToy(lastMinion);
			lastMinion = minions.get(count + 1);

			if (lastMinion.equalsIgnoreCase(minions.get(minions.size() - 1))) {
				minionToy = new MinionToy(lastMinion);
				lastMinion = minions.get(0);
			}
			return minionToy;
		}
		return null;
	}

	@Override
	public void enjoy() {
		System.out.println("MINION TOY: The name of the minion is " + this.minionName);
	}
}