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

    /*
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
     */
// Inheritance in java
    /*
    private String name;
    private int age;
    private String address;

    public String getName(){
        return name;
    }

    public void setName( String name){
        this.name = name;
    }
    public int getAge(){
        return  age;
    }
    public void setAge( int age){
        this.age=age;
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address=address;
    }
}

class Student1 extends Person{
    private double gpa;

    public double getGpa(){
        return gpa;
    }
    public void setGpa(double gpa){
        this.gpa=gpa;
    }
}

class entry{
    public static void main(String[] args){
        Student1 student1 = new Student1();
        student1.setName("Thanh Ha");
        student1.setAge(23);
        student1.setAddress("Da Nang");
        student1.setGpa(4.5);
        System.out.println("Name:" +student1.getName());
        System.out.println("Name:" +student1.getAge());
        System.out.println("Name:" +student1.getAddress());
        System.out.println("Name:" +student1.getGpa());

    }
     */

    //Inheriting constructors
    /*
    private String name;
    private int dob;

    public Person(String name , int dob){
        this.name = name;
        this.dob = dob;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getDob(){
        return dob;
    }
    public void setDob(int dob){
        this.dob = dob;
    }
}
class Student1 extends Person{
    private double gpa;
    public Student1(String name , int dob, double gpa){
        super(name,dob);
        this.gpa = gpa;
    }

    public double getGpa(){
        return gpa;
    }
    public void setGpa(double gpa){
        this.gpa =gpa;
    }
}

class entry1{
    public static void main(String[] args){
        Student1 student1 = new Student1("Thanh Ha",1999,8.9);
        System.out.println("Name:" + student1.getName());
        System.out.println("Date of birth:" + student1.getDob());
        System.out.println("GPA:" + student1.getGpa());
    }
     */

    //@Override
    /*
    public void display() {
        System.out.println("Hello from SuperClass");
    }
}

class SubClass extends Person{
    @Override
    public void display() {
        super.display();
        System.out.println("Hello from SubClass");
    }
}

class entry1 {
    public static void main(String[] args) {
        SubClass s = new SubClass();
        s.display();
    }
     */


//Inheriting constructors and @Override
    /*
    private String name;
    private String gender;

    public Person(String name , String gender){
        this.name = name;
        this.gender = gender;
    }
    public String getName(){
        return name;
    }
    public void  setName(String name){
        this.name = name;
    }
    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender =gender;
    }

    public void display(){
        System.out.println("Name:"+ getName());
        System.out.println("Gender:"+ getGender());
    }
}

class Student1 extends Person{
    private int salary;

    public Student1(String name , String gender, int salary){
        super(name,gender);
        this.salary = salary;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
@Override
    public void display(){
        super.display();
        System.out.println("Salary:" + getSalary());
    }
}

class entry3{
    public static void  main(String[] args){
        Student1  student1 = new Student1("Thanh Ha","Male", 1800);
        student1.display();
    }
     */

    /*
private  String name;
private int age;
private  String address;

public Person(String name, int age,String address){
    this.name = name;
    this.age=age;
    this.address = address;
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
public void setName(String name){
    this.name=name;
}
public void setAge(int age){
    this.age = age;
}
public void setAddress(String address){
    this.address = address;
}
public void display(){
    System.out.println("Name:" + getName());
    System.out.println("Age:" + getAge());
    System.out.println("Address:"+ getAddress());
}
}
class  entry102{
    public static void main(String[] args){
        Student s1 = new Student("Thanh Ha" ,23,"Da Nang",8.8);
        s1.display();
        System.out.println();
        Teacher teacher = new Teacher("Thanh",55,"DN", 1900);
        teacher.display();
    }
     */
}
