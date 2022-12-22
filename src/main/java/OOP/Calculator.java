package OOP;

//Polymorphism with method overloading
  public class Calculator {
    public int add( int a , int b){
        return a + b;
    }
    public double add(double a , double b){
        return a+ b;
    }
    public int add(int a , int b , int c){
        return a + b + c;
    }
}
class entry3{
    public static void main(String[] args){
        Calculator calculator1 = new Calculator();
        System.out.println(calculator1.add(1,2));
        System.out.println(calculator1.add(2.3,2.5));
        System.out.println(calculator1.add(2,3,4));
    }
}

