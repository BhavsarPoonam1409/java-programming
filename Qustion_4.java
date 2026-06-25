class Animal{
    String name;

    public void eat(){
        System.out.println("This is a Animal class in eat method: "+"Eating..!!");
    }
}

class Dog extends Animal{
    public void bark(){
        System.out.println("This is a dog class in bark method: "+"Barking..!!");
    }
}

class Cat extends Animal{
    public void meow(){
        System.out.println("This is a cat class in meow method: "+"Meowing..!!");
    }
}

public class Qus_4 {
    public static void main(String[]args){
        Animal a1 = new Animal();
        Dog d1 = new Dog();
        Cat c1 = new Cat();

        a1.eat();
        d1.bark();
        c1.meow();
    }
}
