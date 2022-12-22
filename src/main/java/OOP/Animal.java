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
/*
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
 */

//polymorphism
public class Animal {
    public void sound(){
        System.out.println("some sound");
    }
}

class Dog extends Animal{
    public void sound(){
        System.out.println("bow bow");
    }
}

class Meow extends Animal{
    public void sound(){
        System.out.println("meow meow");
    }
}
class Duck extends Animal{
    public void sound(){
        System.out.println("quack quack");
    }
}

class entry11{
    public static void main(String[] args){
        Animal[] animals = new Animal[4];
        animals[0] = new Animal();
        animals[1] = new Dog();
        animals[2] = new Meow();
        animals[3] = new Duck();
        for (int i = 0; i < 4 ; i++){
            animals[i].sound();
        }
    }
}