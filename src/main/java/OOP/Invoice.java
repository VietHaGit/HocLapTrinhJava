package OOP;
//relationship between Invoice and Customer
public class Invoice {
    private  int id ;
    private Customer customer;
    private  double amount;

    public Invoice(int id,Customer customer, double amount){
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public Customer getCustomer(){
        return  customer;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
    public String getCustomerName(){
        return customer.getName();
    }
    public  double getAmountAfterDiscount(){
        return amount - amount*customer.getDiscount() / 100;
    }
}

class entry13{
    public static void main(String[] args){
        Customer customer = new Customer(1,20,"Ha");
        Invoice invoice =new Invoice(1 , customer , 2000);
        System.out.println("Customer Name:" +invoice.getCustomerName() );
        System.out.println("Invoice After Discount:"+ invoice.getAmountAfterDiscount());
    }
}
