package OOP;
//kế thừa lớp trừu tượng Employee
public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String name , int paymentPerHour){
        super(name,paymentPerHour);
    }
    @Override//pt gì đè tới thuộc tính của lớp trừu tượng
    public int calculateSalary(){
        return 8 * getPaymentPerHour();
    }
}
