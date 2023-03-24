import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileInputExample {
    void fileInputRead(){
        try {
            FileInputStream fin = new FileInputStream("test.txt");
            int i = 0;
            while ((i=fin.read())!=-1) {
                System.out.print((char) i);
            }
            System.out.println();
            fin.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void fileReader(){
        try {
            FileReader fr = new FileReader("testWriter.txt");
            int i =0;

            while((i=fr.read())!=-1)
            {
                System.out.print((char) i);
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        FileInputExample fi = new FileInputExample();
        fi.fileInputRead();
        fileReader();
    }
}
