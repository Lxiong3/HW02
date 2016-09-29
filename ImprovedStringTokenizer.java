package p5;

import java.util.StringTokenizer;

  /**
   * @author Lei
   */  

public class ImprovedStringTokenizer extends StringTokenizer {

	//inheriting constructors from StringTokenizer

	public ImprovedStringTokenizer(String str, String delim, boolean returnDelims) {
		          super(str, delim, returnDelims);
       }


	public ImprovedStringTokenizer(String str, String delim) {
		          super(str, delim);
	}
	

	public ImprovedStringTokenizer(String str) {
		    super(str);
	}

    //method created to store words in a string array
	public String[] returnWordsInASingleArray () {
		
		int length = countTokens();
		
		//declare string array
		String [] arr = new String [length];
		
		//If a word is discovered, store it into the array element
		int position = 0;
		while(this.hasMoreTokens()) {			
		
			arr[position] = this.nextToken();
			position ++ ;			
		}			
		return arr;
	}

}
