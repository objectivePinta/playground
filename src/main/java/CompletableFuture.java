import java.util.concurrent.ExecutionException;

public class CompletableFuture {
  public static void main(String[] args) throws InterruptedException, ExecutionException {
        System.out.println(makeAString().get());
  }

  public static java.util.concurrent.CompletableFuture<String> makeAString() throws InterruptedException {
      Thread.sleep(2000);
    return java.util.concurrent.CompletableFuture.completedFuture("wow");
  }
}
