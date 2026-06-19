public class Function_overloading_int_float{

	static void addInt(int a, int b){
		int ans = a + b;
		System.out.println(ans);
	}
	
	static void addFloat(float a, float b){
		float ans = a + b;
		System.out.println(ans);
	
	}
	
	public static void main(String[] args){
		addInt(10,5);
		addFloat(10.5f,55.5f);
	}
}