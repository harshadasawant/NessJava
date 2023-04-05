package designPattern;

interface Area{
    String getArea();
}
class Reactangle1 implements Area{

    @Override
    public String getArea() {
        return "Area of Rectangle";
    }
}
class Circle1 implements Area{

    @Override
    public String getArea() {
        return "Area of Circle";
    }
}
class Triangle1 implements Area{

    @Override
    public String getArea() {
        return "Area of Triangle";
    }
}

abstract class  AbstractFactory{
    public abstract Shape getShape(String shape);
    public abstract Area getArea(String areaOfShape);

}

class AreaFactory extends AbstractFactory {
    public Area getArea(String areaOfShape){
        if (areaOfShape.equalsIgnoreCase("Rectangle")) {
            return new Reactangle1();
        }
        if (areaOfShape.equalsIgnoreCase("Triangle")) {
            return new Triangle1();
        }
        if (areaOfShape.equalsIgnoreCase("Circle")) {
            return new Circle1();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }

}

class FactoryCreator{
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("Shape")){
            return new ShapeFactory();
        } if(choice.equalsIgnoreCase("Area")) {
            return new AreaFactory();
        }
        return null;
    }
}
public class AbstractFactoryDesignPattern {
    public static void main(String[] args) {

        AbstractFactory factory = FactoryCreator.getFactory("Shape");
        Shape rectangle = factory.getShape("Rectangle");
        System.out.println("From AbstractFactory : "+rectangle.getShape());

        AbstractFactory factory1 = FactoryCreator.getFactory("Area");
        Area rectangle1 = factory1.getArea("Rectangle");
        System.out.println("From AbstractFactory : "+rectangle1.getArea());

    }

}
