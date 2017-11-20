import java.time.Instant;
import java.time.LocalDate;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by andrei.pinta on 3/30/2017.
 */

public class ScheduledExecutorServiceDemo {
  public static void writeToConsoleRandomNumbers() {
    System.out.printf("\n Random number generated at %s is %d", Instant.now(), random.nextInt(10));
  }

  public static Random random = new Random();

  public static void main(String[] args) {
    System.out.printf("\n Program started at %s", Instant.now());
    ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(8);
    scheduledExecutorService.scheduleWithFixedDelay(() -> writeToConsoleRandomNumbers(), 1, 2, TimeUnit.MINUTES);
  }
}
