import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

abstract class SuperClass{
    public  void display() {
        System.out.println("from super class");
    }
    abstract void disp();

}

class AB{

}
public class Inheritance extends SuperClass{

   public void display()   {
        System.out.println("from sub class");
    }

    @Override
    void disp() {
        System.out.println(" calling from sub class");
    }

    public static void main(String[] args) {
        SuperClass superClass = new Inheritance();

        SuperClass inheritance = new Inheritance();
        Inheritance inheritance1 = new Inheritance();

//        superClass.disp();
//        inheritance.disp(); can not call because reference is a super class can access only super class method
        inheritance.disp();
        System.out.println("================");
        inheritance.display();
        inheritance1.disp();


        superClass.display();
        inheritance1.display();

    }
}
