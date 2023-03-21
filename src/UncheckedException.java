import java.io.IOException;
import java.sql.SQLException;

public class UncheckedException {

        void display() throws MyRunTimeException  {
            System.out.println("I am called from display");
            throw new MyRunTimeException();
        }

        void display2() throws IOException, RuntimeException, SQLException {
            System.out.println("I am called from display");
        throw new IOException();
        }
        public static void main(String[] args) {
            UncheckedException obj = new UncheckedException();
            try {
                obj.display();
            }catch (MyRunTimeException e){
                e.printStackTrace();
            }finally {
                System.out.println("called from finally");
            }

            String s=null;
            if(s != null) {
                System.out.println(s.equals("Hello"));
            } else{
                throw new MyRunTimeException();
            }
            System.out.println("After function");

            try {
                obj.display2();
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }catch (RuntimeException e){
                e.printStackTrace();
            }catch (Exception e){
                e.printStackTrace();
            }


            try {
                obj.display2();
            } catch (SQLException | IOException | RuntimeException  e) {
                e.printStackTrace();
            }


        }

}


class MyRunTimeException extends RuntimeException{

}