package OOP;

import java.lang.*;
import java.lang.Math;

public class Point {
    private double x;
    private  double y ;
    public Point(){

    }
    public Point(double x , double y){
        this.x = x;
         this.y = y;
    }
    public void setX(double x){
        this.x = x;
    }
    public double getX(){
        return x;
    }
    public void setY( double y){
        this.y = y;
    }
    public double getY(){
        return y;
    }
    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double distance(double x, double y) {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }
    public double distance(Point another) {
        return distance(another.getX(), another.getY());
    }
}
class Entry11 {
    public static void main(String[] args) {
    Point p1 = new Point(2.3,3.3);
    Point p2 = new Point(1.3,2.3);
    System.out.println(p1.distance(p2));
    System.out.println(p1.distance(1.1,2.2));
    p1.setX(2.5);
    p1.setY(3.4);
    p2.setX(6.7);
    p2.setY(6.9);
    System.out.println(p1.distance(p2));
    p1.setXY(2.1,4.3);
    p2.setXY(3.3,4.7);
    System.out.println(p1.distance(p2));
    }
}
