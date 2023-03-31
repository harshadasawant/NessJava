import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamClassExample {
    public static void main(String[] args) {
//       1st way
        Stream st = Stream.empty();
//        2nd way
        List<Integer> li = new ArrayList<Integer>();
        li.add(3);
        li.add(1);
        li.add(4);
        li.add(8);
        Stream stream = li.stream();
        System.out.println(stream);

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
