package ExOOP.IoCAndDI;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape square = new Square(5);

        ShapeManager manager = new ShapeManager();
        manager.setShape(circle);
        System.out.print("HH"
        + manager.calculatePerimeter() + " "
        + manager.calculateArea());

        manager.setShape(square);
        System.out.print("HN" +
                manager.calculatePerimeter()+ " "
        + manager.calculateArea());

    }
}
