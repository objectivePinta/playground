import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class SubString {

  public static void main(String[] args) {
      ZoneId utcZ = ZoneId.of("Z");
      ZonedDateTime utcZonedTime = ZonedDateTime.of(LocalDateTime.now(),utcZ);
      System.out.println( Instant.ofEpochSecond(0));

  }

  static boolean isZero(String value) {
    return (value == null) || value.equals("") || value.equals("-0%") || value.equals("+0%") || value.equals("-0zl");
  }
}
