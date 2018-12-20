package hacker.rank.challenges;

public class CountingLetters {

	public static void main(String[] args) {
		
		System.out.println(repeatedString("aba", 10L, 'a'));
		
	}
	
    static int repeatedString(String s, long n, char character) {
      StringBuilder s1 = new StringBuilder();
        int counts = 0;
        
     for(int i = 0; i == n; i++) {
    	 s1.append(s);
    	 i = s1.toString().length();
     }
     
     String s3 = s1.toString();

     char [] someArray = s3.toCharArray();
     
     for(int i = 0; i < someArray.length ; i++ ) {
    	 if(someArray[i] == character) {
    		 counts++;
    	 }
     }
     
    return counts;
    }

}
