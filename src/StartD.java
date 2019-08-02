
public class StartD {

	//This is a simple method to be used for the first test.
	public static String testMethod(String test){
		return test;
	}

	//This method calculates the sum of every number that comes between "lastValue" and 0, including "lastValue".
	public static int sumOfNumbers(int lastValue){
		if(lastValue == 0){
			return 0;
		}

		if(lastValue > 0){
			return lastValue + sumOfNumbers(lastValue-1);
		}
		else if(lastValue < 0){
			return lastValue + sumOfNumbers(lastValue+1);
		}
		else{
			return lastValue;
		}
	}

	//This method creates an array with user input.
	public static int[] createArray(){
		Magic.println("Please enter a the amount of numbers you would like to store.");
		int[] array = new int[Magic.nextInt()];
		for(int i = 0; i < array.length; i++){
			Magic.println("Please enter a number.");
			array[i] = Magic.nextInt();
		}
		return array;
	}

	//This method tests to find the largest value in the array.
	public static int findLargestValue(int[] data){

		int temp = 0;

		if(data.length == 0){
			return -1;
		}
		else{
			for(int i = 0; i < data.length; i++){
				if(temp < data[i]){
					temp = data[i];
				}
			}
		}
		return temp;
	}
	
	public static String isNumEvenOrOdd(int num){
		String phrase = "";
		
		if(num >= 50 ){
			phrase += "high and ";
		}
		else{
			phrase += "low and ";
		}
		
		if(num % 2 == 0){
			phrase += "even";
		}
		else{
			phrase += "odd";
		}
		
		return phrase;
	}



	public static void main(String[] args) {

		Magic.println(sumOfNumbers(5));
		findLargestValue(createArray());
		Magic.println(isNumEvenOrOdd(55));		
		
	}

}
