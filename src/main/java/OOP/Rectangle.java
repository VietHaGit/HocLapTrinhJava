package OOP;

import java.util.Scanner;

public class Rectangle {
    double length;
    double with;

    public void getInformation(){
        Scanner Sc = new Scanner(System.in);
        length = Sc.nextDouble();
        with = Sc.nextDouble();
    }

    public double getArea(){
        return length * with;
    }

    public double getPerimeter(){
        return (length + with) *2;
    }

    public void display(){
        System.out.println("Area:" +getArea());
        System.out.println("Perimeter:" + getPerimeter());
    }
}

class Entry1{
    public static void main(String[] args){
        Rectangle rectangle1 = new Rectangle();
        rectangle1.getInformation();
        rectangle1.display();
    }
}
