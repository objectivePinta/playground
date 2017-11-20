import java.util.ArrayList;
import java.util.List;

public class BreakFun {

  public static boolean returnWhenArrived() {
    for (int i = 1; i < 10; i++) {
      for (int j = 0; j < i; j++) {
        if (i + j == 5) {
          System.out.println(i + " + " + j + "=" + 5);

          return false;
        }
        System.out.println("j=" + j);

      }
      System.out.println("i=" + i);

    }
    return true;
  }

  public static void main(String[] args) {
    List<String> strings = new ArrayList<>();
    strings.addAll(null);

  }
}
