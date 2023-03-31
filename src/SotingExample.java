import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SotingExample {

    static void employeeList() {
        List<Employee1> el = new ArrayList<Employee1>();
        el.add(new Employee1(23, "teju", 5));
        el.add(new Employee1(34, "harsha", 23));
        el.add(new Employee1(45, "rekha", 1));

        Collections.sort(el);

        for (Employee1 e : el) {
            System.out.println(e);
        }
    }
    static void employeeList2() {
        List<Employee2> el = new ArrayList<Employee2>();
        el.add(new Employee2(23, "teju", 5));
        el.add(new Employee2(34, "harsha", 23));
        el.add(new Employee2(45, "rekha", 1));

        Collections.sort(el,new AgeComparator());
        System.out.println("=============Age Comparator===");
        for (Employee2 e : el) {
            System.out.println(e);
        }
        System.out.println("=============Name Comparator===");
        Collections.sort(el,new NameComparator());

        for (Employee2 e : el) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        employeeList();
        employeeList2();
//        List<String> li = new ArrayList<String>();
//        li.add("daksh");
//        li.add("harshada");
//        li.add("teju");
//        li.add("abc");
//        for(String s : li){
//            System.out.println(s);
//        }
//        Collections.sort(li);
//        System.out.println("=============After sorting==========");
//        for(String s : li){
//            System.out.println(s);
//        }
    }
}

class Employee1 implements Comparable<Employee1> {
    int age;
    String name;
    int id;

    public Employee1(int age, String name, int id) {
        this.age = age;
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Employee1 o) {
        return this.name.compareTo(o.name);
    }

}

class Employee2 {
    int age;
    String name;
    int id;

    public Employee2(int age, String name, int id) {
        this.age = age;
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee2{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

}

class AgeComparator implements Comparator<Employee2> {

    @Override
    public int compare(Employee2 o1, Employee2 o2) {
        if (o1.age == o2.age)
            return 0;
        else if (o1.age > o2.age)
            return 1;
        else
            return -1;
    }
}
class NameComparator implements Comparator<Employee2> {

    @Override
    public int compare(Employee2 o1, Employee2 o2) {
        return o1.name.compareTo(o2.name);
    }
}
