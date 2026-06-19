public class SubArr_forloop_ijk{
	public static void main(String[] args){
		int [] A = {4,5,3,2,5,3,1,5};
		
		//print all the subarrays
		//
		// [4] [4,5] [4,5,3] [4,5,3,2]
		// [5] [5,3] [5,3,2] []
		
		int n = A.length;
		for(int i=0; i<n; i++){
			for(int j=i; j<n; j++){
				for(int k=i; k<=j; k++){
					System.out.print(A[k]+ " ");
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}
}