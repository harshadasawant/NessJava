

public interface Interface1 {
    void add();  //public and abstract
    default void add1(){
        System.out.println("from super");
    }

    static void add2(){
        System.out.println("from super");
    }
}
interface f2{
    default void add1(){
        System.out.println("from super");
    }
}

class TestInterface implements Interface1, f2{

    @Override
    public void add() {
        System.out.println("from add method sub class");
    }

    @Override
    public void add1() {
        Interface1.super.add1();
    }

    public static void main(String[] args) {
        TestInterface obj = new TestInterface();
        obj.add();

        Interface1 obj1 = new TestInterface();
        obj1.add();

        obj1.add1();
        Interface1.add2();
    }
}
