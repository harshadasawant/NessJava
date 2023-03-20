public class ShapeFactory {
    ShapeFactory(Shape shape ){
        System.out.println(shape.getSize());
    }

    public static void main(String[] args) {
        Rectangle rec= new Rectangle();

        ShapeFactory shapeFactory =new ShapeFactory(rec);

        Square sq = new Square();
        sq.setSize(45);
        ShapeFactory shapeFactory1 =new ShapeFactory(sq);

        Circle c = new Circle();
        ShapeFactory shapeFactory2 = new ShapeFactory(c);

        System.out.println(c instanceof Shape);
        System.out.println(sq instanceof Shape);
        System.out.println(rec instanceof Shape);

//


    }
}
