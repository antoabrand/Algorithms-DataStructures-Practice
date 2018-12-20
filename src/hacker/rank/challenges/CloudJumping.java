package hacker.rank.challenges;

/**
 * 
 * Emma is playing a new mobile game that starts with consecutively numbered clouds. 
 * Some of the clouds are thunderheads and others are cumulus. 
 * She can jump on any cumulus cloud having a number that is equal to the number of the current cloud plus 1 or 2. 
 * She must avoid the thunderheads. 
 * 
 * Determine the minimum number of jumps it will take Emma to jump from her starting position to the last cloud. 
 * 
 * It is always possible to win the game.

	For each game, Emma will get an array of clouds numbered 0 if they are safe or 1 if they must be avoided. 
	For example, c=[0,1,0,0,0,1,0,] indexed from 0-6. 
	The number on each cloud is its index in the list so she must avoid the clouds at indexes 1 and 5. She could follow the following two paths:  or . The first path takes jumps while the second takes .
 *
 */

public class CloudJumping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] clouds = {0,1,0,0,0,0,0,1,0,1,0,0,0,1,0,0,1,0,1,0,0,0,0,1,0,0,1,0,0,1,0,1,0,1,0,1,0,0,0,1,0,1,0,0,0,1,0,1,0,1,0,0,0,1,0,1,0,0,0,1,0,1,0,0,0,1,0,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,0,1,0,1,0,1,0,1,0,0,0,0,0,0,1,0,0,0};

		System.out.println(jumpingOnClouds(clouds));
	}
	
	  static int jumpingOnClouds(int[] c) {

	        int jumps = 0;
	        for(int i = 0; i < c.length -1; i++){
	            if( ((i + 2) < c.length - 1) && c[i + 2] != 1){
	                jumps++;
	                i++; 
	            } 
	            else if(c[i + 1] != 1){
	                jumps++;     
	            }
	        }
	        return jumps; 
	    }

}
