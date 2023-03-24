import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputExample {
    void fileInputRead(){
        try {
            FileInputStream fin = new FileInputStream("test.txt");
            int i = 0;
            while ((i=fin.read())!=-1) {
                System.out.print((char) i);
            }
            fin.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FileInputExample fi = new FileInputExample();
        fi.fileInputRead();
    }
}
