package OOP;

import java.util.Scanner;

public class Rectangle {
    /*
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
     */

    //getter , setter , contractor
    private double length;
    private double width;

    public Rectangle(){

    }
    public Rectangle( double length, double width){
        this.length = length;
        this.width = width;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getLength(){
        return length;
    }
    public void  setWidth(double width){
        this.width = width;
    }
    public double getWidth(){
        return width;
    }

    public double getArea(){
        return length * width;
    }
    public double getPerimeter(){
        return (width + length ) * 2;
    }
}
class Entry1{
    public static void main(String[] args){
        Rectangle rectangle1 = new Rectangle(4 , 5);
        System.out.println("Area:" +rectangle1.getArea());
        System.out.println("Perimeter:"+rectangle1.getPerimeter());
        rectangle1.setWidth(4.5);
        rectangle1.setLength(3.2);
        System.out.println("Area1:"+rectangle1.getArea());
        System.out.println("Prerimeter1:"+rectangle1.getPerimeter());
    }
}

