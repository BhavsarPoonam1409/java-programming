public class Function_sum_even{
	public static void main(String[] args){
		int [] A = {4,5,3,2,5,3,1,5};
		
		// 4 + 2 = 6 ans print
		// find the sum of all the even nos
		
		int ans = 0;
		for(int i=0; i<A.length; i++){
			if(A[i] % 2 == 0){
				ans = ans + A[i];
			}
		}
		System.out.println(ans);
	}
}