import java.util.Arrays;

public class Arr2DFindboaderelements{
	public static void main(String[] args){
		int [][] myarr = {{1,2,3},{4,5,6},{7,8,9}};
		
		//i= raws 0 2
		//j = cols 0 2
		
		// 1,2,3
		// 4, ,6
		// 7,8,9
		
		
		
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				if(i==0 || i==2 || j==0 || j==2){
					System.out.print(myarr[i][j]);
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

