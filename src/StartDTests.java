import static org.junit.Assert.*;

import org.junit.Test;


public class StartDTests {

	@Test
	public void test() {
		if(StartD.testMethod("hi") == null){
			fail("No String was entered.");
		}
	}
	
	//This tests the method "sumOfNumbers"
	@Test
	public void testSumOfNumbers(){
		assertTrue("The sum wasn't correct",StartD.sumOfNumbers(-5)==-15);
		assertTrue("The sum wasn't correct",StartD.sumOfNumbers(5)==15);
		assertTrue("The sum wasn't correct",StartD.sumOfNumbers(0)==0);
		
	}
	
	//This will test the "findLargestValue" method.
	@Test
	public void testFindLargestValue(){
		
		int[] testArray = {4,3,15,1,100,99,-11,300};
		int[] testArray2 = new int[0];
		int[] testArray3 = {5,5,5,5,5};
		
 		assertTrue("It didn't find the highest value.",StartD.findLargestValue(testArray)==300);
 		assertTrue("It didn't take empty arrays into account.",StartD.findLargestValue(testArray2)==-1);
 		assertTrue("It didn't find the highest value.",StartD.findLargestValue(testArray3)==5);

 		

	}
	
	//This will test the "isNumEvenOrOdd" method.
	@Test
	public void testIsNumEvenOrOdd(){

		assertTrue("For some reason it didn't work for a number over 50",StartD.isNumEvenOrOdd(100).equals("high and even"));
		assertTrue("For some reason it didn't check for 50",StartD.isNumEvenOrOdd(50).equals("high and even"));
		assertTrue("For some reason it didn't check for 0",StartD.isNumEvenOrOdd(10).equals("low and even"));
		assertTrue("For some reason it didn't check for odd and high numbers",StartD.isNumEvenOrOdd(51).equals("high and odd"));
		assertTrue("For some reason it didn't check for low and odd numbers",StartD.isNumEvenOrOdd(11).equals("low and odd"));
		
	}

}
