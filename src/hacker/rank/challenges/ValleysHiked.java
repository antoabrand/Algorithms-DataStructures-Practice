package hacker.rank.challenges;

import java.util.*;

public class ValleysHiked {

	public static void main(String[] args) {
		System.out.println(countingValleys(8, "UDDDUDUU"));

	}

	static int countingValleys(int steps, String path) {

		int valleysHiked = 0;

		int level = 0;

		List<String> pathTaken = Arrays.asList(path.toLowerCase().trim().split(""));

		for (String step : pathTaken) {
			if (step.equals("d")) {
				level--;
			} else {
				level++;
			}
			if (level == 0 && step.equals("u"))
				valleysHiked++;
		}

		return valleysHiked;

	}

}
