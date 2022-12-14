package OOP;

import java.io.PrintStream;

public class Person {
    /*
    private int  Id;
    private String Name;
    private int Age;
    private String Address;

    public Person(int Id, String Name, int Age, String Address){
        this.Id = Id;
        this.Name = Name;
        this.Age = Age;
        this.Address = Address;
    }

    public void display(){
        System.out.println("ID:" + Id);
        System.out.println("Name:" + Name);
        System.out.println("Age:" +Age);
        System.out.println("Address:" + Address);
    }
}

class Test{
    public static void main(String[] args) {
        Person person1 = new Person(1001, "Quynh", 24, "Ha Noi");
        person1.display();
    }
     */

    //getter and setter
    private int id;
    private String name;
    private int age;
    private String address;

    public Person(int id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }
}


class Test{
    public static void main(String[] args){
        Person person1 = new Person(1001, "Quynh",24,"Ha Noi");
        System.out.println("Id:"+ person1.getId());
        System.out.println("Name:" + person1.getName());
        System.out.println("Age:" +person1.getAge());
        System.out.println("Address:" + person1.getAddress());
    }
}
