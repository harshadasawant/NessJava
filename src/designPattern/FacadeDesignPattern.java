package designPattern;

class ShapeMaker{
    private Shape circle;
    private Shape rectangle;
    private Shape triangle;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        triangle = new Triangle();
    }

    public String drawCircle(){
       return circle.getShape();
    }
    public String drawRectangle(){
       return rectangle.getShape();
    }
    public String drawTriangle(){
        return triangle.getShape();
    }

}
public class FacadeDesignPattern {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        System.out.println(shapeMaker.drawCircle());
        System.out.println(shapeMaker.drawTriangle());
        System.out.println(shapeMaker.drawRectangle());

    }

}
