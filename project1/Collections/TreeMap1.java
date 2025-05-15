package Collections;

import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;

public class TreeMap1 {
  public static void main(String[] args) {
    NavigableMap<Integer, String> hp = new TreeMap<>();
    hp.put(1, "srihas");
    hp.put(2, "srihas");
    hp.put(0, "srihas");
    System.out.println(hp);
    hp.ceilingEntry(2);
    System.out.println(hp.descendingMap());
    NavigableSet<Integer> ns = hp.descendingKeySet();
    for (Integer integer : ns) {
      System.out.println(integer);
    }
  }
}
