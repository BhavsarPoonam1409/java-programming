import java.util.Arrays;

public class Arroddno{
	public static void main(String[] args){
		int [] arr = {4,4,5,6,3,2,3,4,4,9,10};
		
		//find the total odd no in the array
		int total = 0;
		
		for(int i=0; i<11; i++){
			if(arr[i] % 2 != 0){
				total++;
			}
		}
		
		System.out.println(total);
	}
}
