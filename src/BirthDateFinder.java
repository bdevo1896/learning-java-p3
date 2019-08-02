
public class BirthDateFinder {

	private static int[] MONTHS_IN_DAYS = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};

	/*
	 * -----|BREAKDOWN|-----
	 * 
	 * 1)
	 * 		Create a method that will find the date based off of the LMP the patient. It will take in a "int"
	 * 		array to represent the date. Using this array, it will calculate the number of days by comparing 
	 * 		to the "MONTHS_IN_DAYS" array. It will then return an "int" array.
	 * 
	 * 2)
	 * 		Create a "void" method to carry out the whole operation of getting the LMP from the user to print-
	 * 		ing out the birthdate.
	 */


	//Returns the birth date based off of the L.M.P.
	public static int[] getBirthDate(int[] lmp){
		int sumOfDays = 0;
		int[] bd = new int[3];

		for(int i = 0; i < lmp[0]-1; i++){
			sumOfDays += MONTHS_IN_DAYS[i];
		}

		sumOfDays += lmp[1];

		int newSumOfDays = 0;
		if((sumOfDays + 280) > 365){
			int index = 0;
			newSumOfDays = (sumOfDays + 280)-365;
			while(newSumOfDays > 31){
				newSumOfDays -= MONTHS_IN_DAYS[index];
				index++;
			}

			bd[0] = index+1;
			bd[1] = newSumOfDays;
			bd[2] = lmp[2]+1;
		}else{
			int index = 0;
			newSumOfDays = sumOfDays + 280;
			while(newSumOfDays > 31){
				newSumOfDays -= MONTHS_IN_DAYS[index];
				index++;
			}

			bd[0] = index+1;
			bd[1] = newSumOfDays;
			bd[2] = lmp[2];

		}

		MONTHS_IN_DAYS[1] = 28;

		return bd;
	}

	public static void getLMP(){

		int[] lmp = new int[3];
		boolean enteringLMP = true;
		
		//This loop will make sure that the LMP is an actual date.
		while(enteringLMP){

			Magic.println("Please enter the month of the LMP.");
			lmp[0] = Magic.nextInt();
			Magic.println("Please enter the day of the LMP.");
			lmp[1] = Magic.nextInt();
			Magic.println("Please enter the year of the LMP.");
			lmp[2] = Magic.nextInt();
			
			for(int i = 0; i < 12; i++){
				if(lmp[0]-1 == i){
					if(lmp[1] <= MONTHS_IN_DAYS[i] && lmp[1] > 0){
						if(lmp[2] > 0){
							//The date is legitimate and the loop ends.
							enteringLMP = false;
						}
					}
				}
			}
			
		}
		
		//These statement will print the birth date based off the LMP.
		int[] birthDate = getBirthDate(lmp);
		Magic.println("Month: "+birthDate[0]+" Day: "+birthDate[1]+" Year: "+birthDate[2]);
		
	}

	public static void main(String[] args) {
		getLMP();
	}

}
