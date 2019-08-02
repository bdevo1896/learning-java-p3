
public class Grader {
	/*
	 * -----|BREAKDOWN OF GRADER|-----
	 * 1)
	 * 		Create a method to ask the user for a certain category of grades and the number of grades they
	 * 		want to enter. Then return the array created from the user input. *Note: This method will have 
	 * 		an "int" parameter for creating a hard-coded list.*
	 * 
	 * 2)
	 * 		Create a method to take in the grades for a category and return its average for that category 
	 * 		as a "double".
	 * 
	 * 3)
	 * 		Create a method to show the letter grade. It will take a "double" parameter and give the letter
	 * 		grade based off of that. It will return a "String".
	 * 		
	 */
	
	//This method will create a "double" array through user input. It will store the category type to inform the user
	//what type of grades are being entered.
		public static double[] createDoubleArray(String category, int numberOfElements){
			
			if(numberOfElements == 0 || numberOfElements < 0){
				Magic.println("How many "+category+" grades will you enter?");
				numberOfElements = Magic.nextInt();
			}
			
			double[] data = new double[numberOfElements];
			for(int i = 0; i < data.length; i++){
				Magic.println("Please enter "+category+" grade ("+(i+1)+")");
				data[i] = Magic.nextInt();
			}
			return data;
		}
		
		
	//This method will take an "int" array as a parameter, and then it will calculate the average from the elements
	//in the array. *Note: will later round up if needed.*
	public static double getAverage(double[] data){
		
		if(data.length > 0){
		double avg = 0.0;
		double sum = 0.0;
		for(int i = 0; i < data.length; i++){
			sum += data[i];
		}
		
		avg = sum / data.length;
		
		double roundedAvg = avg;
		
		//This will check to see if the grade can be rounded up.
		if(avg % (int)avg >= 5 ){
			roundedAvg = Math.ceil(avg);
		}
		
		return roundedAvg;
		}
		else{
			return -1.0;
		}
	}
	
	//This method will return a "String" to indicate the letter 
	//grade.
	public static String getLetterGrade(double grade){
		int roundedGrade = (int) grade;
		String letter = "";
		
		if(roundedGrade < 60){
			letter = "F";
		}
		else if(roundedGrade >= 60 && roundedGrade < 64){
			letter = "D-";
		}
		else if(roundedGrade >= 64 && roundedGrade < 67){
			letter = "D";
		}
		else if(roundedGrade >= 67 && roundedGrade < 70){
			letter = "D+";
		}
		else if(roundedGrade >= 70 && roundedGrade < 73){
			letter = "C-";
		}
		else if(roundedGrade >= 74 && roundedGrade < 77){
			letter = "C";
		}
		else if(roundedGrade >= 77 && roundedGrade < 80){
			letter = "C+";
		}
		else if(roundedGrade >= 80 && roundedGrade < 84){
			letter = "B-";
		}
		else if(roundedGrade >= 84 && roundedGrade < 87){
			letter = "B";
		}
		else if(roundedGrade >= 87 && roundedGrade < 90){
			letter = "B+";
		}
		else if(roundedGrade >= 90 && roundedGrade < 94){
			letter = "A-";
		}
		else if(roundedGrade >= 94 && roundedGrade < 97){
			letter = "A";
		}
		else {
			letter = "A+";
		}
		
		return letter;
	}
	

	public static void main(String[] args) {
		
		double[] tests = createDoubleArray("Test",4);
		double[] quizzes = createDoubleArray("Quiz",0);
		double[] labs = createDoubleArray("Lab",0);
		
		double averageOfTests = getAverage(tests);
		double averageOfQuizzes = getAverage(quizzes);
		double averageOfLabs = getAverage(labs);

		double grade = (averageOfTests * .5) + (averageOfQuizzes * .05) + (averageOfLabs * .4);
		
		Magic.println("Your grade was: "+grade+" so you get a "+ getLetterGrade(grade));
	}

}
