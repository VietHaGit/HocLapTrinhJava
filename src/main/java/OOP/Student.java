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
/*
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
 */

    //setter,getter,contractor
    /*
    private int id;
    private String name;
    private int age;
    private String address;
    private int score;

    public Student(){

    }
    public Student(int id, String name , int age , String address, int score){
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.setScore(score);
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public  void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age =age;
    }
    public int getAge(){
        return age;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return  address;
    }
    public void  setScore(int score) {
        if (score < 0) {
            this.score = 0;
        } else if (score > 10) {
            this.score = 10;
        } else {
            this.score = score;
        }
    }
    public int getScore(){
        return score;
    }

}

 class Entry {
    public static void main(String[] args) {
        Student s = new Student(1001, "Trung", 24, "Ha Noi", 5);
        System.out.println(s.getId());
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getAddress());
        System.out.println(s.getScore());
        s.setScore(-7);
        System.out.println(s.getScore());
        s.setScore(15);
        System.out.println(s.getScore());
    }
     */


   /*
public  class Student extends Person {
    private double gpa;

    public Student(String name , int age,String address, double gpa){
        super(name,age,address);
        this.gpa = gpa;
    }
    public void setGpa(double gpa){
        this.gpa = gpa;
    }
    public double getGpa(){
        return gpa;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("GPA:" + getGpa());
    }
    */

    //toString
    /*
    private String name;
    private String address;
    private double gpa;

    public Student(String name , String address , double gpa){
        this.gpa = gpa;
        this.name = name;
        this.address =address;
    }
    @Override
    public  String toString(){
        return "Name: " + name + ",Address:" + address + ",GPA:" + gpa;
    }
}

class entry5{
    public static void main(String[] args){
        Student student = new Student("Ha" ,"ĐN",8.8);
        System.out.println(student.toString());
    }
     */

    //compare 2 objects in java
    private int id;
    private String name;
    private String address;

    public Student(int id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }
    @Override
    public boolean equals(Object obj){
        return this.id == ((Student) obj).id;
    }
}
class entry12{
    public static void main(String[] args){
        Student s1 = new Student(100,"Ha","ĐN");
        Student s2 = new Student(100, "Ha","ĐN");
        System.out.println(s1.equals(s2));
    }
}




