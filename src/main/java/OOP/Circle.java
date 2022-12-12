package OOP;

public class Circle {
    private double radius;
    public Circle ( double radius){
        this.radius = radius;
    }
    public double getArea(){
        return radius * radius * 3.14;
    }
    public double getCircrumference(){
        return radius * 2 * 3.14;
    }
    public void display(){
        System.out.println("Area:" + getArea());
        System.out.println("Circrumference:" + getCircrumference());
    }
}
class Entry2{
    public static void main(String[] args){
        Circle circle1 = new Circle(7);
        circle1.display();
    }
}
