import java.util.Arrays;

public class Arr2DFindIndexing{
	public static void main(String[] args){
		int [][] myarr = {{1,2,3},{4,5,6},{7,8,9}};
		
		//find the a no ? print the index 8
		
		int n = 8;
		
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				if(myarr[i][j] == n){
					System.out.println(i + "," + j);
				}
			}
			//System.out.println();
		}
	}
}

