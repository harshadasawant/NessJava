import java.io.*;

class Student implements Serializable {
    String name;
    int id;
    Student(String name, int id){
        this.name = name;
        this.id = id;
    }
}
public class SerializableExample {
    void serialize(){
        Student s1 = new Student("Daksh",22);
        try {
            FileOutputStream fout = new FileOutputStream("student.txt");
            ObjectOutputStream obj = new ObjectOutputStream(fout);
            obj.writeObject(s1);
            obj.flush();
            fout.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    void desrialize(){
        try {
            ObjectInputStream obj = new ObjectInputStream( new FileInputStream("student.txt"));
            Student s1 = (Student) obj.readObject();
            System.out.println(s1.name +"  "+s1.id);
        } catch (IOException |ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
    public static void main(String[] args) {
        SerializableExample obj = new SerializableExample();
        obj.serialize();
        obj.desrialize();
    }
}
