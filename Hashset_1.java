import java.util.HashSet;
public class Hashset_1{
	public static void main(String[] args){
	
	int [] A = {1,2,3,4,5,1,2};
	int [] B = {2,4,6,8};
	
	HashSet	<Integer> myset = new HashSet <Integer> ();
	
		for(int i = 0; i < A.length; i++) {
            myset.add(A[i]);
        }

        for(int j = 0; j < B.length; j++) {
            myset.add(B[j]);
        }
	
	System.out.println(myset);
	
	
	}
}