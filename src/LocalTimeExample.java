import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println(time);
        LocalTime specificTime = LocalTime.of(10,44, 35);
        System.out.println(specificTime);
        LocalTime time1 = specificTime.plusHours(1);
        System.out.println(time1);
        LocalTime time2 = specificTime.plusMinutes(30);
        System.out.println(time2);
        LocalTime time3 = specificTime.minusHours(1);
        System.out.println(time3);
        LocalTime time4 = specificTime.minusMinutes(30);
        System.out.println(time4);



    }
}
