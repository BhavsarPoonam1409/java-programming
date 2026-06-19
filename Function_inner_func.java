public class Function_inner_func{

	static void func1(){
		System.out.println("this is func one");
	}
	
	static void func2(){
		System.out.println("this is func two");
		func1();
	}
	
	public static void main(String[] args){
			func2();
	}
}