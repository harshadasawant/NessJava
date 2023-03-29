import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate todaysDate = LocalDate.now();
        LocalDate yesterday = todaysDate.minusDays(1);
        LocalDate dayaftertomm = todaysDate.plusDays(2);
        System.out.println(todaysDate);
        System.out.println(yesterday);
        System.out.println(dayaftertomm);

        LocalDate specificDate = LocalDate.of(1980,6,22);
        System.out.println(specificDate);

       DayOfWeek day =  specificDate.getDayOfWeek();
        System.out.println(day);
        String s= specificDate.format(DateTimeFormatter.ISO_DATE);
        System.out.println(s);

        System.out.println(specificDate.format(DateTimeFormatter.ISO_LOCAL_DATE));
        String dateStr= "2015-06-22";
        LocalDate d = LocalDate.parse(dateStr);
        System.out.println(d);

    }
}
