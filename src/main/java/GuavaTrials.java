import java.util.stream.IntStream;

public class GuavaTrials {

  public static void main(String[] args) throws InterruptedException {
  // what();
   doSomething();
  }


  public static boolean react(int v) {
    if (v > 0) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean what() {
    for (int i : IntStream.range(0, 1000).toArray()) {
      if (i > 200) {
        return false;
      }
      System.out.println(i);
    }
    return true;
  }

  public static void doSomething(String...strings) {
    System.out.println(strings.length);
    if (strings == null) {
      System.out.println("They are null");
    }
  }
}
