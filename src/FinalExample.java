 class SuperClass1{
  final void add(){
       System.out.println("From add method");
   }
}
public class FinalExample extends SuperClass1{
    final int a= 23;
//    void add(){
//        System.out.println("from sub class add method");
//    }


    public static void main(String[] args) {
        FinalExample obj = new FinalExample();
        System.out.println(obj.a);
        FinalExample obj1 = new FinalExample();
        System.out.println(obj1.a);
        obj.add();
    }
}

