public class Hello {
    public static void main(String[] args) {
        String firstName;
        String lastName;
        System.out.println("Hello "+args[0]+"  "+args[1]);
        int a=7;
        Integer intObj = a; // boxing
        int b = intObj; // unboxing

        byte b1=3;
        short s = b1;  //2byte
        byte b2 = b1;  //1byt
        double f = 6.5;
        float fr = 4.5F;
        final Double d =8.7;

        System.out.println(d);



    }
}
