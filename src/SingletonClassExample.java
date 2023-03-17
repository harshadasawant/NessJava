public class SingletonClassExample {
    public static SingletonClassExample obj = null;
    private SingletonClassExample(){

    }
    public static SingletonClassExample getInstance1(){
        if (obj != null) {
            return obj;
        } else{
            obj = new SingletonClassExample();
            return obj;
        }
    }

}
class Outer{
    public static void main(String[] args) {
        SingletonClassExample obj2 =  SingletonClassExample.getInstance1();
        SingletonClassExample obj3 =  SingletonClassExample.getInstance1();
        System.out.println(obj2 == obj3);

    }
}