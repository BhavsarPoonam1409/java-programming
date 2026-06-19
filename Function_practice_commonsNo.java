public class Function_practice_commonsNo{
	public static void main(String[] args){
		int [] a = {4,5,3,2,5,3,1,5};
		int [] b = {3,6,7,2,5,2,1,8};
		
		//5 3 2 2 5 3 1 5
		// find the all commons no in both the arrays 
		
		for(int i=0; i<a.length; i++){
			for(int j=0; j<b.length; j++){
				if(a[i] == b[j]){
					System.out.println(a[i]);
				}
			}
		}
	}

}