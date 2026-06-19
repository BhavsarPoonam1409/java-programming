interface Software{
	public void Developer();
}

interface AIML{
	public void AiEngineer();
}

class Student implements Software,AIML{
	String name;
	Student(String n){
		this.name = n;
	}
	public void Developer(){
		System.out.println("This is Software Developer Student");
	}
	public void AiEngineer(){
		System.out.println("This is AI-ML Engineer Student");
	}
	
}
public class Interfaces_implement{
	public static void main(String[] args){
		Student s1 = new Student("Poonam");
		s1.Developer();
		s1.AiEngineer();
		System.out.println("Student name: " + s1.name);
	}
}