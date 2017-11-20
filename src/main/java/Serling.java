public class Serling {
  private static final int[] PRICE_PER_LENGTH = { 1, 5, 8, 9, 10, 17, 16, 20, 24, 24 };

  public static void main(String[] args) {
    System.out.println(getBestPrice(10));
  }

  static Integer getBestPrice(int length) {
    if (length == 0) {
      return 0;
    }
    else {
      int best = -100000;
      for (int i = 0; i < length; i++) {
        Integer bestPrice = getBestPrice(length - i - 1);
        best = max(best, PRICE_PER_LENGTH[i] + bestPrice);
      }
      return best;
    }
  }

  static Integer max(Integer a, Integer b) {
    if (a == b) {
      return a;
    }
    else if (a > b) {
      return a;
    }
    return b;
  }
}
