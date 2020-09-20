package hackerrank;

public class Human {
	private static Human human;

	private Human() {}

	public static Human getInstance() {
		if (human == null)
			human = new Human();

		return human;
	}

}