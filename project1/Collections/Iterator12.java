package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Iterator12 {
  public static void main(String[] args) {
    Collection<Integer> arr = new ArrayList<>();
    arr.add(1);
    arr.add(2);
    arr.add(3);
    Iterator<Integer> it = arr.iterator();
    while (it.hasNext()) {
      int val = it.next();
      System.out.println(val);

    }
  }
}
