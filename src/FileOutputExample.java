import java.io.*;

public class FileOutputExample {
    void writeFile() {
        try {
            FileOutputStream out = new FileOutputStream("test.txt");
            String s = "Hello world!";
            out.write("Harshada".getBytes());
            out.close();
            System.out.println("sucessfully created file....");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void writeFileWithWriter() {
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

    static void createFile() {
        File file = new File("testWriter1.txt");
        boolean isFileCreate = false;
        try {
            isFileCreate = file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("File Created =" + isFileCreate);
    }

    static void deleteFile() {
        File file = new File("testWriter1.txt");
        boolean isFileDeleted = false;
        isFileDeleted = file.delete();
        System.out.println("File delete =" + isFileDeleted);
    }

    public static void main(String[] args) {
        FileOutputExample obj = new FileOutputExample();
        obj.writeFileWithWriter();
        obj.writeFile();
        createFile();

        deleteFile();
    }
}
