
public class BuildingBlocks {
	
	public static int average(int[] array){
		int total = 0;
		int length = array.length;
		for(int i =0; i < length;i++){
			total+=array[i];
		}
		if(length>0){
		int avg = total/length;
		return avg;
		}
		return -1;
	}
	

	public static double product(double a, double b, double c){
		double value = a*b*c;
		return value;
	}
	
	public static void main(String[] args) {
		// Look in BuildingBlockTests for the questions

	}

}
