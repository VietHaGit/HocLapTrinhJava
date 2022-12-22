package OOP;

// up-casting
/*
public class Animal {
    public void sound(){
        System.out.println("some sound");
    }
}

class Cat extends Animal{
    public void sound(){
        System.out.println("meow meow");
    }
}
class Dog extends Animal {
    public void  sound(){
        System.out.println("woof woof");
    }
}
class entry13{
    public static void main(String[] args){
        Animal animal = new Cat();
        animal.sound();
        Animal animal1 = new Dog();
        animal1.sound();
    }
}
 */

// Down-casting

public class Animal {
    public void sound(){
        System.out.println(" some sound");
    }
}
class Dog extends Animal{
    public void sound(){
        System.out.println("woof woof");
    }
    public void play(){
        System.out.println("The dog is playing");
    }
}

class entry13{
    public static void main(String[] args){
        Animal animal = new Dog();

        //Down - casting
        ((Dog)animal).play();
    }
}