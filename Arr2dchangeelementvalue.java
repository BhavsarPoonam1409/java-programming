import java.util.Arrays;
public class Arr2dchangeelementvalue{
	public static void main(String[] args){
	//if we have all the elements
	int [][] myarr = {{1,2,3},{4,5,6},{7,8,9}};
	
	//change 8 > 80
	myarr[2][1] = 80;
	
	//we have the size of the array
	int [] myarr2 = new int[5];
	
	System.out.println(myarr[2][1]);
	
	}
}