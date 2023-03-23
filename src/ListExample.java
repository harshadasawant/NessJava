import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<Object>();
        al.add("Harshada");
        al.add(2);
        al.add(5.4f);
        for (Object o : al) {
            System.out.println(o.equals("Harshada"));
        }

        ArrayList<Employee> al1 = new ArrayList<Employee>();
        al1.add(new Employee("Harshada"));
        al1.add(new Employee("Teju"));

        for (Employee e : al1) {
            System.out.println(e.employee_Name.equals("Teju"));
        }

        List<Integer> al2 = new Vector<Integer>();
        al2.add(4);
        al2.add(5);
        al2.add(46);
        for (Integer i : al2) {
            System.out.println(i);
        }
        LinkedList<String> li = new LinkedList<String>();
        li.add("Harshada1");
        li.add("Harshada2");
        li.add("Harshada3");
        li.add("Harshada4");
        li.add("Harshada5");
        System.out.println(li.pollFirst());
        System.out.println(li.pollLast());
        li.addFirst("Harshada0");
        li.addLast("Harshada6");
        for (String s : li) {
            System.out.println(s);
        }
        System.out.println("=================================");
        li.removeFirst();
        li.removeLast();
        for (String s : li) {
            System.out.println(s);
        }
    }
}
