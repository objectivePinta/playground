import java.util.List;
import java.util.Map;

public class MaMap {

  public static void main(String[] args) {
//    Map<String, Integer> nameAge = new HashMap<>();
//    MaMap maMap = new MaMap();
//    maMap.fuckMap(nameAge);
//    System.out.println(maMap);
    List<String> string = null;
    string.forEach(t -> t.toString());
  }

  void fuckMap(Map<String, Integer> map) {
    map.putIfAbsent("Aa", 22);
  }
}
