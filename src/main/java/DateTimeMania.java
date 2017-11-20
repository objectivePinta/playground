import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeMania {

    public static void main(String[] args) {
        LocalDate localDate =  LocalDate.now();
        String dateAsString = localDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        System.out.println(dateAsString);
        BigDecimal bigDecimal = new BigDecimal(2.33).setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.println(Math.abs(bigDecimal.intValue()));

    }
}
