import java.util.Arrays;

public class Arrmaxvalue{
	public static void main(String[] args){
		
		//Integer.max_value; - positive infinity
		//Integer.min_value; - nagative infinity
		int [] arr = {4,4,5,6,3,2,3,4,4,9,10};
		
		//find the max no in the array
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		
		}
		System.out.println("Maximum value: " + max);

	}
}