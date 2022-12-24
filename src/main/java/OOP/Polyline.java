package OOP;

import java.util.ArrayList;
import java.util.List;
import java.lang.Math;
//relationship between Pulyline and Point
public class Polyline {
    private List<Point> points;

    public Polyline(){
        points = new ArrayList<Point>();
    }
    public Polyline(List<Point> points){
        this.points = points;
    }
    public  void appendPoint(Point point){
        points.add(point);
    }
    public  void appendPoint(int x , int y){
        points.add( new Point(x, y));
    }

    public double getLength() {
        double length = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            int x1 = points.get(i).getX();
            int y1 = points.get(i).getY();
            int x2 = points.get(i + 1).getX();
            int y2 = points.get(i + 1).getY();
            double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
            length += distance;
        }
        return length;
    }
}

 class Entry4 {
    public static void main(String[] args) {
        Polyline polyLine = new Polyline();
        polyLine.appendPoint(new Point(1, 1));
        polyLine.appendPoint(new Point(2, 3));
        polyLine.appendPoint(3, 0);
        polyLine.appendPoint(4, 2);
        System.out.println(polyLine.getLength());
    }
}
