package OOP;

public class Account {
    private int id;
    private String name;
    private int blance = 0;

    public Account(int id, String name){
        this.id = id;
        this.name = name;
    }
    public Account ( int id , String name , int blance ){
        this.id = id;
        this.name = name;
        this.blance = blance;
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

    public int getBlance() {
        return blance;
    }
    public void deposit(int amount){
         blance += amount;
    }
    public void withdraw(int amount){
        blance -= amount;
        if (blance < amount){
            System.out.println("That amount exceeds your current balance.");
        }

    }
    public void display(){
        System.out.println("ID:"+ id);
        System.out.println("Name:"+ name);
        System.out.println("balance:" + blance);
    }
}

class Entry111{
    public static void main(String[] args){
        Account a1 = new Account(1001,"Thanh Ha",2000);
        a1.display();
        a1.withdraw(200);
        System.out.println("Balance:" + a1.getBlance());
        a1.deposit(400);
        a1.display();
    }
}


