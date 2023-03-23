
interface  FI{
    void add();
}
public class InterfaceExample implements FI{
    public void add(){
        System.out.println("add");
    }

    public static void main(String[] args) {
        FI obj = new InterfaceExample();
        obj.add();
        InterfaceExample obj1 = new InterfaceExample();
        obj1.add();
    }
}

class DifferentClass{
    public static void main(String[] args) {

    }
}