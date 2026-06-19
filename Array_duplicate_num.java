import java.util.Arrays;
public class Array_duplicate_num{
	public static void main(String[] args){
		int [] num={12,12,90,25,12,90,55,14};
		Arrays.sort(num);
		for(int i=0; i<=num.length-1; i++){
			int count=0;
			for(int j=i+1; j<=num.length-1; j++){
				if(num[i] == num[j]){
					count++;
				}
			}
			if(count == 0){
				System.out.println(num[i] + " ");
			}
		}
	}
}