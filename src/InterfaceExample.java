@FunctionalInterface
interface FI {
    void add(int a);

    default void add1() {
        System.out.println("from default add method");
    }

}

public class InterfaceExample implements FI {
    public void add(int a) {
        System.out.println("add");
    }


    public static void main(String[] args) {
        FI obj = new InterfaceExample();
        obj.add(2);
        InterfaceExample obj1 = new InterfaceExample();
        obj1.add(2);
    }
}

class DifferentClass {
    public static void main(String[] args) {
        FI obj = new FI() {
            public void add(int a) {
                System.out.println("from add method");
            }
        };
        obj.add(4);

        FI obj1 = (a) -> {
            System.out.println("from add method lambda == " + a);
        };

        obj1.add(3);


    }
}