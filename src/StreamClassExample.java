import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamClassExample {
    static void intermediateTerminateOperation(){
        List<Integer> li = new ArrayList<Integer>();
        li.add(3);
        li.add(1);
        li.add(4);
        li.add(8);
        li.add(2);
        li.add(10);
        li.add(10);
        li.add(10);
//sorted, distict, filter, map
        li.stream().filter(t->  t%2==0).sorted().distinct().map(e->e*e).forEach(a->{
            System.out.println(a);
        });
        System.out.println("===================");
//        count
       long l =  li.stream().filter(t->  t%2==0).sorted().distinct().map(e->e*e).count();
        System.out.println("no of element = "+l);
//        reduce()
       Optional<Integer> op= li.stream().reduce((a1, b)-> a1+b);
        System.out.println("value = "+op.get());

//collect
        List<Integer> li1 = li.stream().collect(Collectors.toList());
        System.out.println("==========List started ====================");
        for(int i: li1) {
            System.out.println(i);
        }
        System.out.println("=======================");


    }
    public static void main(String[] args) {
        intermediateTerminateOperation();
//       1st way
        Stream st = Stream.empty();
//        2nd way
        List<Integer> li = new ArrayList<Integer>();
        li.add(3);
        li.add(1);
        li.add(4);
        li.add(8);
        Stream stream = li.stream();

        stream.forEach(a->{
            System.out.println(a);
        });

    //3rd way to create stream
        Collection<String> collection = Arrays.asList("a","b","c");
        Stream<String> stream1 = collection.stream();
        stream1.forEach(a->{
            System.out.println(a);
        });
//4th way to create Stream
        Stream<Float> stream2 = Stream.of(2.3f,7.8f,4.5f);
        stream2.forEach(a->{
            System.out.println(a);
        });
//5th way to create stream
        Stream stream3 = Stream.builder().add("harsha").add("teju").add("daksh").build();
        stream3.forEach(a->{
            System.out.println(a);
        });
//6th way to create stream
       Stream stream4 =  Stream.generate(()-> "Harshada").limit(10);
        stream4.forEach(a->{
            System.out.println(a);
        });
//7th way to create stream
        String arr[]={"a","b","c"};
        Stream<String> arrstream =    Arrays.stream(arr);
        arrstream.forEach(a->{
            System.out.println(a);
        });
    }
}
