import java.util.Arrays;

public class Arraddition{
	public static void main(String[] args){
		int [] arr = {10,20,30,40,50};
		
		int ans = 0;
		
		for(int i=0; i<=4; i++){
			ans = ans + arr[i];
		}
		System.out.println(ans);
	}
}

