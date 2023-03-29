import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ForEachExample {
    public static void main(String[] args) {
        int a[]={3,4,5,6};
        for(int a1: a){
            System.out.println(a1);
        }

        List<String> li = new LinkedList<>();
        li.add("abc");
        li.add("xyz");
        li.add("pqr");
        li.forEach(t->{
            System.out.println(t);
        });

    }
}
