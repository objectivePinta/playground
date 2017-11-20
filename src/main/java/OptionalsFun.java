import java.util.Optional;

public class OptionalsFun {

  public static void main(String[] args) {
      Optional<String> ifString = Optional.ofNullable(null);
      System.out.println(ifString);
      Optional<String> ifString2 = Optional.of(null);
      System.out.println(ifString2);

  }
}
