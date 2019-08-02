import static org.junit.Assert.*;

import org.junit.Test;


public class BuildingBlockTests {

	//Question 1. 
	/* Copy the following code and change it so you provide three different test values
	 */
	@Test
	public void testProductSimple() {
		if(BuildingBlocks.product(1, 1, 1)!=1){
			fail("1*1*1 does not equal 1 for some reason");
		} 
		if (BuildingBlocks.product(2, 3, 4)!=24){
			fail("2*3*4 does not equal 24 for some reason");
		}
		
		if (BuildingBlocks.product(0, 99, 500)!=0){
			fail("0*99*500does not equal 0 for some reason");
		}  
	}
	
	//This is the answer to question 1 (3 different test values)
	@Test
	public void testProductSimple2() {
		if(BuildingBlocks.product(1, 1, 1)!=4){
			fail("1*1*1 does not equal 1 for some reason");
		} 
		if (BuildingBlocks.product(2, 3, 4)!=12){
			fail("2*3*4 does not equal 24 for some reason");
		}
		
		if (BuildingBlocks.product(0, 99, 500)!=5){
			fail("0*99*500does not equal 0 for some reason");
		}  
	}
	
	//Question 2
	/* Copy the following code and change it so you provide three different test values
	 */
	@Test
	public void testProductWithAssert() {
		assertTrue("1*1*1 does not equal 1 for some reason",BuildingBlocks.product(1, 1, 1)==1);
		assertTrue("2*3*4 does not equal 24 for some reason",BuildingBlocks.product(2, 3, 4)==24);
		assertTrue("0*99*500does not equal 0 for some reason",BuildingBlocks.product(0, 99, 500)==0);
	}
	
	//Answer to question 2 (3 different test values)
	@Test
	public void testProductWithAssert2() {
		assertTrue("1*1*1 does not equal 4 for some reason",BuildingBlocks.product(1, 1, 1)==4);
		assertTrue("2*3*4 does not equal 12 for some reason",BuildingBlocks.product(2, 3, 4)==12);
		assertTrue("0*99*500does not equal 5 for some reason",BuildingBlocks.product(0, 99, 500)==5);
	}
	
	//Question 3
	/* Modify the following code so that you use a value different than 10 
	 */
	@Test
	public void testAverage() {
		int data[] = new int[5];
		data[0] = 45;
		data[1] = 45;
		data[2] = 45;
		data[3] = 45;
		data[4] = 45;
		assertTrue("Cannot average 5 of same number", BuildingBlocks.average(data)==45);
	}	
	
	//Question 4 
	/* Copy the testAverage above and create a new test that has a different size array and uses
	 * different values (so, not just 5 of the same number but perhaps 7 of different numbers)
	 *  
	 */
	
	@Test
	public void testAverage2() {
		int data[] = {3,77,18,7,10,6,25};
		
		assertTrue("Cannot average 7 of same number", BuildingBlocks.average(data)==12);
	}	
	
	//Question 5
	/* Copy the testAverage above and create a test where the array is empty
	 * If there is a bug in BuiildingBlocks.average, fix that method. 
	 */
	
	@Test
	public void testAverage3() {
		int data[] = new int[0];
		
		assertTrue("Cannot average NOTHING", BuildingBlocks.average(data)>0);
	}	

}
