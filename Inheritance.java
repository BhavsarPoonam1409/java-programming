class Employee{
	String name;
	int salary;
	int age;
	
	
}

class Developer extends Employee{
	String programinglanguage;
	String software;

}

class Sales extends Employee{
	String fintech;
}
public class Inheritance{
public static void main(String[] args){

	Developer d1 = new Developer();
	Sales s1 = new Sales();
	
	d1.name = "Poonam";
	d1.salary = 100000;
	d1.age = 18;
	d1.programinglanguage = "Java";
	d1.software = "Software Developer";
	
	s1.name = "ekta";
	s1.salary = 100000;
	s1.age = 18;
	s1.fintech = "sales manager";
	
	
	System.out.println("****** person 1 developer: ****** ");
	System.out.println("name : " + d1.name);
	System.out.println("salary: "+ d1.salary);
	System.out.println("age: " + d1.age);
	System.out.println("programinglanguage: "+ d1.programinglanguage);
	System.out.println("software: " + d1.software);
	
	System.out.println("");
	
	System.out.println(" ****** person 2 sales: ******");
	System.out.println("name : " +s1.name);
	System.out.println("salary: "+s1.salary);
	System.out.println("age: " +s1.age);
	System.out.println("fintech: " +s1.fintech);
	
	
	}
}