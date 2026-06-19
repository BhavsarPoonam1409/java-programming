import java.util.Arrays;

public class Arr2d159printcondition{
	public static void main(String[] args){
		int [][] myarr = {{1,2,3},{4,5,6},{7,8,9}};
		
		// 1 2 3
		// 4 5 6
		// 7 8 9
		
		for(int i=0; i<3; i++){
			for(int j=0; j<4; j++){
				if(i == j){
					System.out.print(myarr[i][j]);
				}
			}
			System.out.println();
		}
	}
}

