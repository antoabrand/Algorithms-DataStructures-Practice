package hackerrank;

import java.util.*;

public class CheckSums {

	public static void main(String[] args) {
		//   numberOfDice numberOfSides numberOfDiceToSum checksum
		String testInput = "5 6 3 15";
		System.out.println(getAnswer(testInput));
	}
	
	private static int getAnswer(String testInput) {
		String [] inputs = testInput.split(" ");
		Set <List<Integer>> uniqueDiceRolls = new HashSet<>();
		List<Integer> roll;
		int nDice = 0;
		int sides = 0;
		int diceToSum = 0;
		int checksum = 0; 
		int answer = 0; 
		int setMaxSize = 0; 
		
		//get my inputs
		for(int i = 0; i < 1; i++) {
			nDice = Integer.parseInt(inputs[i]);
			sides = Integer.parseInt(inputs[i + 1]);
			diceToSum = Integer.parseInt(inputs[i + 2]);
			checksum = Integer.parseInt(inputs[i+3]);
		}
			
		//checking constraints
		if(nDice < 1 || nDice > 10000) return 0; 
		if(sides < 4 || sides > 50) return 0; 
		if(diceToSum < 1|| diceToSum > 50) return 0;
		if(nDice < diceToSum) return 0;
		
		setMaxSize = (int) Math.pow(sides, nDice);
	
		uniqueDiceRolls = makeSet(setMaxSize,nDice,sides);
		
		return getAnswer(uniqueDiceRolls,diceToSum, checksum);
	}

	private static Set<List<Integer>> makeSet(int setMaxSize, int nDice, int sides){
		List<Integer> roll;
		Set<List<Integer>> uniqueRolls = new HashSet<>();
		Random r = new Random();
		boolean stopRolling = false;
		
		while(!stopRolling) {
			int sum = 0;
			roll = new ArrayList<>();
		
			//get my roll
			for(int i = 0; i < nDice; i++) {
				roll.add((r.nextInt(sides) + 1));
			}
			uniqueRolls.add(roll);	
			
			//check if i need to break
			if(uniqueRolls.size() == setMaxSize)
				stopRolling = !stopRolling;
		}
		return uniqueRolls;
	}
	
	private static int getAnswer(Set<List<Integer>> uniqueRolls, int diceToSum,int checksum) {
		int answer=0;
	
		sortSet(uniqueRolls);
		answer = checkSum(diceToSum,uniqueRolls,checksum);
		return answer;
	}
	

	private static void sortSet(Set<List<Integer>> unsortedSet) {
		for(List s : unsortedSet) {
			Collections.sort(s);
			Collections.reverse(s);
		}
	}
	
	private static int checkSum(int diceToSum, Set<List<Integer>> uniqueRolls, int checksum) {
		int answer = 0;
		
		for(List<Integer> l : uniqueRolls) {
			int sum = 0;
		
			for(int i = 0; i < diceToSum; i++ ) {
				sum +=  l.get(i);
			}
	
			if(sum == checksum)
				answer++;
		}
		return answer;
	}
	
	public String whoAmI() {
		return "Coming form CheckSums";
	}
}