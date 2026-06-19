public class Swep_element_Arr{
	public static void main(String[] args){
		int [] num = {1,2,3,4,5};
		
		num[0] = num[0] + num[num.length-1];
		num[num.length-1] = num[0]-num[num.length-1];  // 5 1
		num[0] = num[0] - num[num.length-1];       //6-1=5 num[4]=1  // num[0] = 5 
		
		for(int i=0; i<=num.length-1; i++){
			System.out.println(num[i]);
		}
	
	}
}