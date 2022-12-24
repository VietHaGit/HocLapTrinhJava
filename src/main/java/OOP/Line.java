package OOP;
import java.lang.*;
import java.lang.Math;

//Combined relationship between Line and Point
public class Line {

    private Point begin;
    private Point end;

    public Line( Point begin, Point end){
        this.begin = begin;
        this.end = end;
    }
    public Line(int x1 , int x2 , int y1 , int y2){
        this.begin = new Point(x1 , y1);
        this.end = new Point(x2 , y2);
    }

    public void setBegin(Point begin){
        this.begin = begin;
    }
    public Point getBegin(){
        return begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public double getLength(){
        return  Math.sqrt(Math.pow(end.getX() - begin.getX(), 2) + Math.pow(end.getY() - begin.getY(), 2));
    }
}
 class Entry5 {
    public static void main(String[] args) {
        Point begin = new Point(1, 1);
        Point end = new Point(2, 2);
        Line line1 = new Line(begin, end);
        System.out.println(line1.getLength());

        Line line2 = new Line(2, 3, 5, 4);
        System.out.println(line2.getLength());
    }
}
