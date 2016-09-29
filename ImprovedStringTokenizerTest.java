package p5;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

/**
 * @author xionglei
 */

	public class ImprovedStringTokenizerTest {
		
		
		private static ImprovedStringTokenizer Rose, Jack, Tom, Jerry;
		@Before
		public void setUp() throws Exception {
			Rose = new ImprovedStringTokenizer("this is Rose");
			Jack = new ImprovedStringTokenizer("this|is|Jack", "|");
			Tom = new ImprovedStringTokenizer("this|is|Tom", "|", true);
			Jerry = new ImprovedStringTokenizer("test|is|Jerry", "|", false);
		}

		@Test
		public void testImprovedStringTokenizerString() {
			
			Rose.countTokens();
		}

		@Test
		public void testImprovedStringTokenizerStringString() {
			
			Jack.countTokens();
			
		}

		@Test
		public void testImprovedStringTokenizerStringStringBoolean() {
			
			Tom.countTokens();
			Jerry.countTokens();
			
		}

		@Test
		public void testReturnWordsInSingleArray() {
			
			String [] aArr = Rose.returnWordsInASingleArray();
			String [] bArr = Jack.returnWordsInASingleArray();
			String [] cArr = Tom.returnWordsInASingleArray();
			String [] dArr = Jerry.returnWordsInASingleArray();
						
			System.out.println(Arrays.toString(aArr));
			System.out.println(Arrays.toString(bArr));
			System.out.println(Arrays.toString(cArr));
			System.out.println(Arrays.toString(dArr));
			

		}

	}

