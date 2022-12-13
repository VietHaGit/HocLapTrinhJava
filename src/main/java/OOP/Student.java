package OOP;

import javax.naming.Name;
import java.util.Scanner;

public class Student {
    /*
    String Name;
    int Age;
    public void Display()
    {
        System.out.println("Name:" + Name);
        System.out.println("Age:" + Age);
    }
}

class Entry {
    public  static void main(String[] args) {
        Student student1 = new Student();
        student1.Name = "Linh";
        student1.Age = 23;
        student1.Display();
    }

     */

//Write a program to declare a Student class
    // Declare the list of attributes

    /*
    String Name;
    int Age;
    //Declare the list of methods
    public void display(){
        System.out.println("Name:" +Name);
        System.out.println("Age:" +Age);
    }

    public void getinformation(){
        Scanner Sc = new Scanner(System.in);
        Name = Sc.nextLine();
        Age = Sc.nextInt();
    }
}
class Entry{
    public static void main(String[] args){
        Student student1 = new Student(); // Declare s1 object of Student class
        student1.getinformation();
        student1.display();
    }
     */

    //contractor
    /*
    private String Name;
    private int Age;
    public Student (String Name , int Age){
        this.Name = Name;
        this.Age = Age;
    }
    public void Show(){
        System.out.println("Name:" + Name);
        System.out.println("Age:" + Age);
    }
}
class Entry{
    public static void main(String[] args){
        Student student1 = new Student("ThanhHa", 23);
        Student student2 = new Student("Hoa", 22);
        student1.Show();
        student2.Show();
    }
     */

    //Contractor
    /*
    private String name;
    private  int age;
    private String gender;
    private  double gpa;

    public Student (String name,int age, String gender , double gpa){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.gpa = gpa;
    }

    public void display(){
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Gender:" + gender);
        System.out.println("GPA:" + gpa);
    }
}

class Entry{
    public static void main(String[] args) {
        Student student1 = new Student("ThanhHa", 23, "Nam", 2.454);
        student1.display();
    }
     */

    //array of objects
/*
    private String Name;
    private  int Age;
    public Student(String Name , int Age){
        this.Name = Name;
        this.Age = Age;
    }
    public void display(){
        System.out.println("Name:" + Name);
        System.out.println("Age:" + Age);
    }

}

class Entry{
    public static void main(String[] args){
        Student[] student1 = new Student[3];
        student1[0] = new Student("ThanhHa", 23);
        student1[1] = new Student("Hoa", 22);
        student1[2] = new Student("Thanh",22);
        for (int i = 0 ; i < 3 ;i ++){
            student1[i].display();
        }
    }
 */

   // method overloading

    private String name;
    private char gender;

    public Student(){
        name = "Unknown";
        gender = 'u';
    }
    public Student(String name){
        this.name = name;
        gender = 'u';
    }

    public Student(char gender){
        this.gender = gender;
        name = "Unknown";
    }

    public Student( String name , char gender){
        this.name = name;
        this.gender = gender;
    }

    public void display(){
        System.out.println("Name:" + name);
        if (gender == 'm'){
            System.out.println("Gender: Male");
        }
        if (gender == 'f'){
            System.out.println("Gender: Female");
        }
        if (gender == 'u'){
            System.out.println("Gender: Unknown");
        }
    }
}
class run12{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.display();
        Student s2 = new Student("Quang");
        s2.display();
        Student s3 = new Student('m');
        s3.display();
        Student s4 = new Student("Thu", 'f');
        s4.display();
    }
}



