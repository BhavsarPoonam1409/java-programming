import java.util.Arrays;

public class Arrminno{
	public static void main(String[] args){
		int [] arr = {1,4,5,6,3,2,1,4,4,9,10};
		
		//find the max no in the array
		int min = 11;
		
		for(int i=0; i<11; i++){
			if(arr[i] < min){
				min = arr[i];
			}
		}
		System.out.println(min);
	
	}
}