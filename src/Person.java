public class Person
{
//    instance variable
    String name;
    int age;
    float h,w;

    public void display(){
        int a;  //local variable
        a=0;
        System.out.println("a = "+a);
        System.out.println("i called from function");
    }


    public static void main(String[] args) {
//        p is a object or u can called as instance
        Person p = new Person();
        System.out.println(Math.sqrt(-1));
        System.out.println(Math.pow(99999,999999999));
//        p.age=8;
//        p.name="harshada";
//        p.h=5.5f;
//        p.w=55.2f;
        System.out.println(p.age);
        System.out.println(p.name);
        p.display();
//        p.a=45;


    }

}

/*
acess_specifier return_type function_name(){
    function body
}

access_specifier-> private protected public and default
return_type-> data_type, int, String,float, void
function_name-> can be anything
()-> argument

*/


