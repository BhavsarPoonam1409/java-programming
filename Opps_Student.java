public class Opps_Student{
	String name = "";
	int age = 1;
	int enrollmentno = 1;
	String course = "";
	int	sem = 1;
	int year = 1;
	String gender = "";


	public static void main(String[] args){
		Opps_Student Poonam = new Opps_Student();
		Opps_Student Jiya = new Opps_Student();
		
		Poonam.name = "Poonam";
		Poonam.age = 18;
		Poonam.enrollmentno = 10007;
		Poonam.course = "Software Development(Web Mobile)";
		Poonam.sem = 2;
		Poonam.year = 1;
		Poonam.gender = "Female";
		
		System.out.println("name: "+ Poonam.name);
		System.out.println("age: "+ Poonam.age);
		System.out.println("enrollmentno: "+ Poonam.enrollmentno);
		System.out.println("course: "+ Poonam.course);
		System.out.println("sem: "+ Poonam.sem);
		System.out.println("year: "+ Poonam.year);
		System.out.println("gender: "+ Poonam.gender);
		
	
	}
}