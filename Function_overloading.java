public class Function_overloading{

	static void add(int a, int b){
		int ans = a + b;
		System.out.println(ans);
	}
	
	static void add(float a, float b){
		float ans = a + b;
		System.out.println(ans);
	
	}
	
	public static void main(String[] args){
		add(10,5);
	}
}