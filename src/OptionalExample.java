import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> emptyObj = Optional.empty();
        Optional<Integer> obj = Optional.of(3);
        Optional<Integer> obj1 = Optional.ofNullable(null);
        System.out.println(emptyObj);
        System.out.println(obj.get());
//        System.out.println(emptyObj.get()); throw Exception as NoSuchElementException
        System.out.println(emptyObj.isEmpty());
        System.out.println(obj1.isPresent());
        System.out.println(obj1);
        System.out.println(obj1.orElse(4));
        System.out.println(obj1.orElseGet(() -> {
            return 9;
        }));
    }

}
