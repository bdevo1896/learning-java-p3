import static org.junit.Assert.*;

import org.junit.Test;


public class GraderTests {

	//This will test the "getAverage" method.
	@Test
	public void testGetAverage() {
		//Tests for an array with nothing in it.
		assertTrue("Didn't take an array of no size into account.", Grader.getAverage(new double[0])==-1.0);
		//Tests for an array of elements that are the same.
		assertTrue("Didn't get the correct average when every number is the same in an array.",Grader.getAverage(new double[]{100,100,100})==100.0);
		//Test a regular array.
		assertTrue("Didn't get the correct average.",Grader.getAverage(new double[]{100,200,300,400,500})==300);

	}
	
	//This will test the "getLetterGrade" method.
	@Test
	public void testGetLetterGrade(){
		//Tests with a negative number.
		assertTrue("Didn't take negative numbers into account.",Grader.getLetterGrade(-10.0).equals("F"));
		//Tests with a number that is very high (isn't likely)
		assertTrue("Didn't take negative numbers into account.",Grader.getLetterGrade(300.0).equals("A+"));
		//Tests a letter grade.
			assertTrue("Didn't take negative numbers into account.",Grader.getLetterGrade(72).equals("C-"));
	}
}
