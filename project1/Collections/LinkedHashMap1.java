package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap1 {
  public static void main(String[] args) {
    Map<Integer, String> LHP = new LinkedHashMap<>(0, 0, true); // access Order Freq used ele at end;
    Map<Integer, String> LHP1 = new LinkedHashMap<>(); // Noral Linked HashMap which follow insertion order by DOUBLY
                                                       // LINKED LIST
    LHP.put(1, "srihas");
    LHP.putIfAbsent(2, "Srihas12");
    System.out.println(LHP);
    System.out.println(LHP.get(1));
    System.out.println(LHP);
  }
}
