//abstract class
abstract class Animal{
	public abstract void animalsound();  //abstract method
	
	public void sleep(){  //regular simple method
		System.out.println("This is a sleep method: 'zzz' ");
	}
}

class pig extends Animal{
	public void animalsound(){
		System.out.println("This is animalsound method : 'the pig says:wee wee' ");
	}
}

public class Abstraction{
	public static void main(String[] args){
		
		//child class obj after access the parent class method 
		pig myobj = new pig();
		myobj.animalsound();
		myobj.sleep();
	}
}

