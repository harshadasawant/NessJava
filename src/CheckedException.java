import java.io.IOException;
import java.sql.SQLException;

public class CheckedException {
    void display() throws MyCheckedException {
        System.out.println("I am called from display");
        throw new MyCheckedException();
    }

    void display2() throws IOException {
        System.out.println("I am called from display");
//        throw new IOException();
    }
    public static void main(String[] args) {
        CheckedException obj = new CheckedException();
       try {
           obj.display();
           System.out.println("after function call");
           return;
       }catch (MyCheckedException e){
           e.printStackTrace();
       }finally {
           System.out.println("called from finally block");
       }
        System.out.println("after calling method");
        try {
            obj.display2();
            System.out.println("after function call2");
            return;
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            System.out.println("called from finally block2");
        }
    }

}


class MyCheckedException extends Exception{

}

