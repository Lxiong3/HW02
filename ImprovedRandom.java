package p4;

import java.util.Random;

/**
 * @author xionglei
 */
public class ImprovedRandom extends Random {		
		
	private static final long serialVersionUID = 1;
		
	public ImprovedRandom(){}

	public ImprovedRandom(long seed) {
			super(seed);
	}
					
	 //return random number in the range of [low, high]
		 
	public int generateIntegerInRange (int low, int high) {
			
		int out = nextInt( high + 1 - low ) + low;
			
		return out;
			
	}
}


