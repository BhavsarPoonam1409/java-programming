import java.util.Arrays;

public class Arr2dHorijontalLineElement{
	public static void main(String[] args){
		//if we have all the elements print
		int [][] myarr = {{1,2,3,10},{4,5,6,20},{7,8,9,30}};
	
		// 1,2,3,10
		//4,5,6,20
		//7,8,9,30
		
			for(int i=0; i<3; i++){
				for(int j=0; j<4; j++){
					System.out.println(myarr[i][j]);
				}
				//System.out.println();
				//this line to print 
				// 1,2,3,10
				//4,5,6,20
				//7,8,9,30
			}
	}
}

