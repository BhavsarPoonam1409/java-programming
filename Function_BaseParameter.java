public class Function_BaseParameter{

	static void add(int a, int b, int c){
			int ans = a + b + c;
			System.out.println(ans);
	}
	
	static void add(float a,float b){
		float ans = a + b;
		System.out.println(ans);
	}
	
	public static void main(String[] args){
		add(10,5,4);   //int
		add(10,5);     //float 
	}
}