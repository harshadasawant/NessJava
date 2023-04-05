package designPattern;

import java.awt.*;

interface  Shape{
    String getShape();
    void setShape(String shape);
}
class Rectangle implements Shape {

    String shape;

    @Override
    public String getShape() {
        return "Rectangle";
    }

    @Override
    public void setShape(String shape) {
        this.shape = shape;
    }
}

class Circle implements Shape {
    String shape;

    @Override
    public String getShape() {
        return "Circle";
    }

    @Override
    public void setShape(String shape) {
        this.shape = shape;
    }
}

class Triangle implements Shape {
    String shape;

    @Override
    public String getShape() {
        return "Triangle";
    }

    @Override
    public void setShape(String shape) {
        this.shape = shape;
    }
}

class ShapeFactory extends AbstractFactory {
    public Shape getShape(String shape) {
        if (shape.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        }
        if (shape.equalsIgnoreCase("Triangle")) {
            return new Triangle();
        }
        if (shape.equalsIgnoreCase("Circle")) {
            return new Circle();
        }
        return null;
    }

    @Override
    public Area getArea(String areaOfShape) {
        return null;
    }
}


public class FactoryDesignPattern {
    public static void main(String[] args) {
//        Rectangle rec = new Rectangle();
//        Shape rec1 = new Rectangle(); //
//        rec1.setShape("Rectanle");
//        System.out.println(rec1.getShape());
//
//        Shape circle = new Circle(); //
//        circle.setShape("Circle");
//        System.out.println(circle.getShape());
//
//        Shape tri = new Triangle(); //
//        tri.setShape("Triangle");
//        System.out.println(tri.getShape());


        ShapeFactory factory = new ShapeFactory();

        Shape rectangle = factory.getShape("Rectangle");
        System.out.println(rectangle.getShape());

        Shape triangle = factory.getShape("Triangle");
        System.out.println(triangle.getShape());

        Shape cir = factory.getShape("Circle");
        System.out.println(cir.getShape());


    }
}
