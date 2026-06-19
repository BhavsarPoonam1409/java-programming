class Person{
	String name;
	int age;
	
	//constructor use 
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
}
//access parent class attribute dont repeat and write all time this attribute name and age access all way in child class
class Student extends Person{
	int marks;
	public Student(String name,int age,int marks){
		//super function use
		super(name,age);
		this.marks=marks;
	}
}
class Faculty extends Person{
	String sub;
	public Faculty(String name,int age,String sub){
		super(name,age);
		this.sub=sub;                                  
	}
}

public class Super_method{
	public static void main(String[] args){
		
		Student s1 = new Student("Poonam",18,200);
		Faculty f1 = new Faculty("Meezan Malick",30,"java");
		
		System.out.println("***** Print Student Details *****");
		System.out.println("Student name is: " + s1.name);
		System.out.println("Student age is: " + s1.age);
		System.out.println("Student marks is: " + s1.marks);
		
		System.out.println("");
		
		System.out.println("***** Print Faculty Details *****");
		System.out.println("Faculty name is: " + f1.name);
		System.out.println("Faculty age is: " + f1.age);
		System.out.println("Faculty subject is: " + f1.sub);
	}
}