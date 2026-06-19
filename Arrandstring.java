import java.util.Arrays;

public class Arrandstring{
	public static void main(String[] args){
	
		String [] names = new String[3];
		
		names[0] = "Bhavsar";
		names[1] = "Poonam";
		names[2] = "NarendraBhai";
	
		int [] arr = new int[5];
		
		//arr=[10,20,30,40,50];
		//		0,1,2,3,4,
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		for(int i=0; i<=4; i++){
			System.out.println(arr[i]);
		}
		
		for(int i=0; i<=2; i++){
			System.out.println(names[i]);
		}
	}
}