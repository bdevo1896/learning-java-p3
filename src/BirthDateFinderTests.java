import static org.junit.Assert.*;

import org.junit.Test;


public class BirthDateFinderTests {
	
	//Tests the "getBirthDate" method.
	@Test
	public void testGetBirthDate() {
		
		BirthDateFinder b = new BirthDateFinder();
		
		int[] testDate1 = new int[3];
		testDate1[0] = 12;
		testDate1[1] = 31;
		testDate1[2] = 2008;
		assertArrayEquals("The method is not working correctly",b.getBirthDate(testDate1), (new int[]{10,7,2009}));
		assertArrayEquals("The method is not working correctly",BirthDateFinder.getBirthDate(new int[]{1,1,2010}),new int[]{10,8,2010});
		assertArrayEquals("The method is not working correctly",BirthDateFinder.getBirthDate(new int[]{1,5,2010}),new int[]{10,12,2010});


	}

}
