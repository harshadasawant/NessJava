import java.util.Objects;

public class StringExample {
    String name;
    public static void main(String[] args) {
        String s1="abc";
        String s2 = new String("abc");
        String s3="abc";
        String s4 = new String("abc");
        System.out.println();
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);  //false
        System.out.println(s1 == s3);  //true
        System.out.println(s2 == s4);
        System.out.println(s2.equals(s4));


        System.out.println("==================String Object============");
        StringExample obj = new StringExample();
        obj.name="xyz";
        StringExample obj1 = new StringExample();
        obj1.name="xyz1";

        System.out.println(obj == obj1);  //F
        System.out.println(obj.equals(obj1)); //F

        System.out.println(obj);
        System.out.println(obj1);
    }

    @Override
    public String toString() {
        return "StringExample{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        StringExample obj = (StringExample)o;
       return obj.name.equals(this.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
