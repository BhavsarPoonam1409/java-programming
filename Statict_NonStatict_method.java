public class Statict_NonStatict_method{
		
	static void Hello(){   // static 
		System.out.println("Poonam Bhavsar");
			//use int to return values and void to not return values
	}
	
	public void Poonam(){  //non static 
		int a = 14;
		int b = 9;
		int result = a + b;
		System.out.println(result);
	}
	
	
	public static void main(String[] args){
		Statict_NonStatict_method p1 = new Statict_NonStatict_method();  //object 
		
	Hello();
	p1.Poonam();
	
	
	
	}
}