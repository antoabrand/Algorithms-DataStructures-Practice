package tony.sorts;

public class SelectionSort {

	public static void main(String[] args) {
		
		int intArray [] = {1,33,5,-39,23,100};
		
		for(int lastUnsorted = intArray.length -1; lastUnsorted > 0 ; lastUnsorted --) {
			
			int largest = 0;
			
			for(int inner = 1; inner <= lastUnsorted; inner++) {
				if(intArray[inner] > intArray[largest]) {
					largest = inner; 
				}
				swap(intArray, largest, lastUnsorted);
			}
			
		}
		
		//display what is in the array now
		for(int i : intArray) {
			System.out.print(i+",");
		}

	}
    //stores first element value in a temp variable so as to not lose during swapping
    public static void swap(int[] array, int index, int index2) {
        if (index == index2) {
            return;
        }

        int temp = array[index];
        array[index] = array[index2];
        array[index2] = temp;
    }

}
