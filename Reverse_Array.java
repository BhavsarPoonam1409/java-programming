public class Reverse_Array{
	public static void main(String[] args){
		int [] num = {1,2,3,4,5};
		
		for(int i=0; i<=num.length /2; i++){
			int temp = num[i];
			num[i] = num[num.length-1-i];
			num[num.length-1-i] = temp;
			System.out.println(num[i]);
		
		}
	
	}
}