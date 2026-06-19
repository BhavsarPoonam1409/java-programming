public class Array_Count_Number{
	public static void main(String[] args){
		int [] num = {12,78,90,45,67,45};
		int count = 0;
		for(int i=0; i<=num.length-1; i++){
			if(num[i] == 45){
				count++;
			}
		}
		System.out.println("45 is " + count + " time appear ");
	
	}
}