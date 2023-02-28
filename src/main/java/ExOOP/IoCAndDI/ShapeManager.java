package ExOOP.IoCAndDI;

public class ShapeManager {
    private Shape  shape;
    // injector : setter
    public void setShape(Shape shape){
        this.shape = shape;
    }
    public float calculatePerimeter(){
        return this.shape.getPerimeter();
    }
    public float calculateArea(){
        return this.shape.getArea();
    }
}
