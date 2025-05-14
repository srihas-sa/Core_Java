package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
  public static void main(String[] args) {
    Map<Integer, String> mp = new HashMap<Integer, String>();
    mp.put(0, "srihas0");
    mp.put(1, null);
    mp.put(null, "srihasnu");
    mp.putIfAbsent(1, "srihas1");
    System.out.println(mp.containsKey(1));
    System.out.println(mp.containsValue("srihas"));

    for (Map.Entry<Integer, String> iterator11 : mp.entrySet()) {

      System.out.println(iterator11.getKey());
      System.out.println(iterator11.hashCode());
      System.out.println(iterator11.getValue());
    }
  }
}
