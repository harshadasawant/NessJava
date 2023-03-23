import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("harshada");
       set.add("harshada 2");
       set.add("harshada 3");
       set.add("harshada 4");
       for (String s : set){
           System.out.println(s);
       }

        System.out.println("==========sorted==============");
        Set<String> set1 = new TreeSet<String>();
        set1.add("harshada");
        set1.add("harshada 2");
        set1.add("harshada 3");
        set1.add("harshada 4");
        for (String s : set1){
            System.out.println(s);
        }
    }
}
