package project.euler.problems;

import java.util.ArrayList;
import java.util.List;

public class LargestPrimeFactor {

	public static void main(String[] args) {
		List<Long> listOfPrimeFactors = new ArrayList<>();
		System.out.println(getLargestFactor(getPrimeFactors(600851475143L,listOfPrimeFactors)));
		for(Long n : listOfPrimeFactors) {System.out.println(n);}
		
		System.out.println();
		System.out.println(600851475143L%3);
	}

	public static List<Long> getPrimeFactors(long num, List<Long> listOfPrimeFactors){
		
		long divisor = 2; 
		
		while(num > 1) {
			while(num % divisor == 0) {
				listOfPrimeFactors.add(divisor);
				num /= divisor; 
			}
			divisor++;
		}
		return listOfPrimeFactors;
	
	}


	public static Long getLargestFactor(List<Long> listOfPrimeFactors){

		Long largestFactor = 0L;

		for(Long n : listOfPrimeFactors){
		    if(n > largestFactor) largestFactor = n; 
		}

		return largestFactor; 

	}

}
