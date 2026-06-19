import java.util.Arrays;

public class Arrminvalue{
	public static void main(String[] args){
		
		//Integer.max_value; - positive infinity
		//Integer.min_value; - nagative infinity
		int [] arr = {4,4,5,6,3,2,3,4,4,9,10};
		
		//find the max no in the array
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<11; i++){
			if(arr[i] < min){
				min = arr[i];
			}
		
		}
		System.out.println("Minimum value: " + min);

	}
}