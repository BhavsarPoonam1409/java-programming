import java.util.Arrays;

public class Arr2d357Useloopwithminus{
	public static void main(String[] args){
		int [][] myarr = {{1,2,3},{4,5,6},{7,8,9}};
		
		// 1 2 3
		// 4 5 6
		// 7 8 9
		
		for(int i=0; i<3; i++){
			for(int j=2-i; j<=2-i; j++){
				System.out.println(myarr[i][j]);
			}
			//System.out.println();
		}
	}
}

