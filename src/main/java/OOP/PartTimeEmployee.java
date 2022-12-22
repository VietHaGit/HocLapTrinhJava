package OOP;
//kế thừa lớp trừu tượng Employee
public class PartTimeEmployee extends Employee {
    private int workingHours;
    public  PartTimeEmployee(String name , int paymentPerHou , int workingHours){
        super(name,paymentPerHou);
        this.workingHours = workingHours;
    }
@Override //pt gì đè tới phương thức của lớp trừu tượng
    public int calculateSalary(){
        return workingHours * getPaymentPerHour();
}

}
