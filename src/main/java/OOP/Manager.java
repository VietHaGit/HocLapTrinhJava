package OOP;

public class Manager extends Employee {
    private int bonnus;
    public Manager(String name , int salary, int bonnus){
        super(name,salary);
        this.bonnus = bonnus;
    }
    public void setBonnus(int bonnus){
        this.bonnus=bonnus;
    }
    public int getBonnus(){
        return bonnus;
    }
    public int getSalary(){
        return super.getSalary() + bonnus;
    }
    @Override
    public void  display(){
        super.display();
    }
}
