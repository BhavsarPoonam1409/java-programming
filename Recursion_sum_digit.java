public class Recursion_sum_digit{
	static int sum_digit(int n){
		if(n == 0){
			return 0;
		}
		int lastdigit = n % 10;
		return lastdigit + sum_digit(n/10);
	}

	public static void main(String[] args){
		int num = 551;
		int result = sum_digit(num);
		System.out.println(result);
	}
}