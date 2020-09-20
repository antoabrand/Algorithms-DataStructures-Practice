package sorting.serching;

public class ShellSort {

	public static void main(String[] args) {

		int[] intArray = {20, 35, -15, 7, 55, -22};
	
		
		for(int gap = intArray.length/2; gap > 0 ; gap /= 2) {
			
			for(int i = gap; i < intArray.length; i++) {
				//storing value in temp
				int temp = intArray[i];
			
				//use this to get to beginning of array with j -gap
				int j = i;
				
				while(j >= gap && intArray[j - gap] > temp) {
					intArray[j] = intArray[j-gap];
					j -= gap; 
				}
				
				intArray[j] = temp; 
						}
		}
		
		//display the collection once sorted
		for (int i = 0; i < intArray.length; i++) {
	         System.out.println(intArray[i]);
	    }
	}

}
