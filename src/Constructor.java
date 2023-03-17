
class ABC {
    ABC(int a) {
        System.out.println(" this is calling from super class " + a);
    }

    ABC() {
        System.out.println("calling from super class default constructor");
    }
}

public class Constructor extends ABC {
    Constructor(int a) {
        super(87);
        System.out.println("i am calling from constructor  " + a);
    }

    Constructor(String a) {
        this(8); //It is calling current class default constructor
//        this(); must be the first statement into constructor body
        System.out.println(a);
    }

    Constructor() {
        this(67);
        System.out.println("this is default Constructor");
    }

    public static void main(String[] args) {
//        Constructor obj;
//        new Constructor("hello");
        new Constructor();
    }
}
