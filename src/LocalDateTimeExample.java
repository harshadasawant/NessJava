import javax.swing.text.DateFormatter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String s = dateTime.format(formatter);
        System.out.println(s);
        System.out.println(dateTime.get(ChronoField.DAY_OF_MONTH));
        System.out.println(dateTime.get(ChronoField.HOUR_OF_DAY));
        System.out.println(dateTime.plusDays(3));
        System.out.println(dateTime.plusMinutes(40));
    }
}
