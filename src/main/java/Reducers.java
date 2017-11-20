import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by andrei.pinta on 3/30/2017.
 */
public class Reducers {

  public static void main(String[] args) {
    Set<Integer> set = new HashSet<>();
    Integer[] arr = { 9, 243, 2, 123, 2, 12313, 123, 9, 1 };
    set.addAll(Arrays.asList(arr));
    System.out.printf("max: %d", set.stream().reduce(0, (a, b) -> a > b ? a : b));
  }
}
