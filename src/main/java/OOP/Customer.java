package OOP;
/*
public class Customer extends Person {
    private int balance;
    public Customer(String name , String address, int balance){
        super(name, address);
        this.balance = balance;
    }
    @Override //gì đè phương thức trừu tượng
    public void display(){
        System.out.println("Name:" + getName());
        System.out.println("address:" + getAddress());
        System.out.println("Balance:" + balance);
    }
}
 */

public class  Customer  {
    private  int id;
    private String name;
    private int discount;

    public Customer(int id, int discount , String name){
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }
}
