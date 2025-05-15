package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap1 {
  public static void main(String[] args) {
    Map<Integer, String> LHP = new LinkedHashMap<>();
    LHP.put(1, "srihas");
    LHP.putIfAbsent(2, "Srihas12");
    System.out.println(LHP);

  }
}
