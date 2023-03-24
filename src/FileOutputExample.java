import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputExample {
    void writeFile(){
        try {
            FileOutputStream out = new FileOutputStream("test.txt");
            String s="Hello world!";
            out.write("Harshada".getBytes());
            out.close();
            System.out.println("sucessfully created file....");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
    FileOutputExample obj = new FileOutputExample();
    obj.writeFile();
    }
}
