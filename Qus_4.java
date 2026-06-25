class Person{
    String name;
    int age;
    String gender;

    
    public Person(String name,int age,String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;

    }
    public void walking(){
        System.out.println("walking!!");
    }

}
class Student extends Person{
    public Student(String name,int age,String gender){
        super(name,age,gender);

    }
    public void attendClass(){
        System.out.println("class attended!!");
    }
    public void walking(){
        System.out.println("poonam is walking!!");
    }
}


public class Qus_4 {
    public static void main(String[]args){
        
        Student s1 = new Student("Poonam Bhavsar", 18, "Female");
        System.out.println("Name is: "+s1.name);
        System.out.println("Age is: "+s1.age);
        System.out.println("Gender is: "+s1.gender);
        
        Person p1 = new Person("poonam",18,"Female");
        p1.walking();
        s1.walking();
        s1.attendClass();

    }
}
