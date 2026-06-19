public class pen_class{
	
	String Name;
	String color;
	
	
	public void write(){  //non static
		System.out.println("this is write method");
	}
	
	static void hii(){  //static
		System.out.println("this is hii method");
		
	}
	
	public static void main(String[]  args){
		pen_class p1 = new pen_class();
		
		p1.Name = "Poonam"; //p1 object
		p1.color = "Green";
		
		p1.write();
		
		hii();
		System.out.println(p1.Name);
		System.out.println(p1.color);
	}
}