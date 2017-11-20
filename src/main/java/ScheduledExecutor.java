import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class ScheduledExecutor {

  public static void main(String[] args) {
    final Boolean[] b = { false };
    ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
    scheduledExecutorService.execute(() -> {
      b[0] = doSomething();
      System.out.println(b[0]);
    });
    System.out.println(b[0]);
  }

  public static boolean doSomething() {
    return true;
  }
}
