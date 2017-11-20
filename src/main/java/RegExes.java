import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExes {

  public static void main(String[] args) {

    String stringul = "Previous value given 26.46 for column content/request[1]/newBasicUnitBuyPriceLocalCurrency is not the one from DB 26. ERROR -1";
    String keyword = " for column content\\/request[1]\\/newBasicUnitBuyPriceLocalCurrency is not the one from DB 26. ERROR -";
      String START = "Previous value given ";  // A literal "(" character in regex
      String END   = " for column content/request[1]/newBasicUnitBuyPriceLocalCurrency is not the one from DB )";  // A literal ")" character in regex
      String pattern = START + "(\\w+)" + END;
      Pattern p = Pattern.compile(pattern);
      Matcher matcher = p.matcher(stringul);
      if (matcher.find()) {
          System.out.println(matcher.group());
      }
  }
}
