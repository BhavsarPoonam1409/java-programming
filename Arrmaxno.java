import java.util.Arrays;

public class Arrmaxno{
	public static void main(String[] args){
		int [] arr = {1,4,5,6,3,2,1,4,4,9,10};
		
		//find the max no in the array
		int max = 0;
		
		for(int i=0; i<11; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		System.out.println(max);
	
	}
}