class  College{
	public void education(){
		System.out.println("Provide degree after education");
	}
}

class Student extends College{
		public void education(){
			System.out.println("Complete his study");
		}
}

class Faculty extends College{
	public void education(){
		System.out.println("Teach Student");
	}
}

public class Polymorphism_college{
	public static void main(String[] args){
			College c1 = new College();
			Student s1 = new Student();
			Faculty f1 = new Faculty();
			
			c1.education();
			s1.education();
			f1.education();
		}
}