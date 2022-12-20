package OOP;

public class Employee {
    /*
    private int id;
    private String firstName;
    private String lastName;
    private int Salary;

    public Employee(int id, String firstName , String lastName , int Salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.Salary = Salary;
    }
    public void  setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setSalary( int Salary){
        this.Salary = Salary;
    }
    public int getSalary(){
        return  Salary;
    }
    public String getFullName(){
        return firstName + lastName;
    }
}

class Entry101{
    public static void main(String[] args){
        Employee employee1 = new Employee(252513,"Thanh","Ha",23);
        System.out.println("Id:" + employee1.getId());
        System.out.println("FullName:" + employee1.getFullName());
        System.out.println("Salary:" + employee1.getSalary());
        employee1.setId(101);
        employee1.setFirstName("Hoa");
        employee1.setLastName("Ngu");
        employee1.setSalary(22);
        System.out.println("Id:" + employee1.getId());
        System.out.println("FullName:" + employee1.getFullName());
        System.out.println("Salary:" + employee1.getSalary());
    }
     */

    private String name;
    private  int salary;
    public Employee(String name , int salary){
        this.name = name ;
        this.salary = salary;
    }
    public void setName(String name){
        this.name = name;
    }
    public void  setSalary(int salary){
        this.salary = salary;
    }
    public String getName(){
        return  name;
    }
    public int getSalary(){
        return salary;
    }
    public void display(){
        System.out.println("Name:" + getName());
        System.out.println("Salary:"+ getSalary());
    }
}
class entry4{
    public static void main(String[] args){
        Manager manager = new Manager("Ha",7000,200);
        manager.display();
    }
}
