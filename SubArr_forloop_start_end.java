public class SubArr_forloop_start_end{
	public static void main(String[] args){
		int [] A = {4,5,3,2,5,3,1,5};
		
		//print all the subarrays
		//
		// [4] [4,5] [4,5,3] [4,5,3,2]
		// [5] [5,3] [5,3,2] []
		
		int n = A.length;
		for(int start=0; start<n; start++){
			for(int end=start; end<n; end++){
				for(int curr=start; curr<=end; curr++){
					System.out.print(A[curr]+" ");
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}
}