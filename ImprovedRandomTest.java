package p4;

import org.junit.Before;
import org.junit.Test;

/**
 * @author xionglei
 */

public class ImprovedRandomTest {

	
	private static ImprovedRandom X, L;		
	@Before
	public void setUp() throws Exception {
		X = new ImprovedRandom();
		L = new ImprovedRandom(1);
	}

	@Test
	public void testImprovedRandomLong() {
		L.nextBoolean();
		
	}

	@Test
	public void testGenerateIntegerInRange() {
		
		int Xresult, Lresult;

			
		 Xresult = X.generateIntegerInRange(4, 10);
		 Lresult = L.generateIntegerInRange(9, 15);
		

		System.out.println(Xresult);
		System.out.println(Lresult);
				
	}

}
