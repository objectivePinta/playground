import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * Created by andrei.pinta on 3/30/2017.
 */
public class TimeJavaEight {

  public static void main(String[] args) {
    // LocalDateTime now = LocalDateTime.ofInstant(Instant.now(), ZoneId.of("Europe/Bucharest"));
    // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:MM:ss");
    // Instant then = Instant.parse("2017-03-30T08:39:02.0Z");
    // LocalDateTime then2 = LocalDateTime.ofInstant(then, ZoneOffset.ofHours(0));
    // System.out.printf("Now is %s \n", Instant.now());
    // System.out.printf("Then was %s \n", then);
    // System.out.printf("Zone ids: %s \n", ZoneId.getAvailableZoneIds());
    // System.out.printf("The number of hours since then is %d", then2.until(now, ChronoUnit.HOURS));

    Instant instant = Instant.now();
    LocalDate localDate = Instant.ofEpochMilli(instant.toEpochMilli()).atZone(ZoneId.systemDefault()).toLocalDate();
//    System.out.printf(localDate.toString());
    System.out.printf(DateTimeFormatter.ofPattern("yyyyMMddHHmmss").withZone(ZoneId.systemDefault()).format(instant));
      Date date = new Date();
      System.out.println("\n"+date.toInstant().toString());
  }
}
