import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
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
    void writeFileWithWriter(){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("testWriter.txt");
            fileWriter.write("This is file writting with String");
            fileWriter.close();
            System.out.println("created file with writter");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
    FileOutputExample obj = new FileOutputExample();
    obj.writeFileWithWriter();
    obj.writeFile();
    }
}
