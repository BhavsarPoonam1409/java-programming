public class Function_sum_Odd{
	public static void main(String[] args){
		int [] A = {4,5,3,2,5,3,1,5};
		
		
		// find the sum of all the odd nos
		
		int ans = 0;
		for(int i=0; i<A.length; i++){
			if(A[i] % 2 != 0){
				ans = ans + A[i];
			}
		}
		System.out.println(ans);
	}
}