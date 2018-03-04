package hacker.rank.challenges;

public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		add(1,2,4,3);
	}
	
	private static void add(Integer ...num) {
		Integer sum= 0;
		String answer = "";
		for(Integer i : num) {
			sum+=i;
			System.out.print(answer + i);
			answer = "+";
		}

		System.out.println("=" + sum );
	}
	

}
