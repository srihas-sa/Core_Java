package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class Lists {
  public static void main(String args[]) {
    // Collection cl=new List(); Wont work beacause list is also a interface we need
    // to use class to assign mmemory so we have build in classes
    Collection<Integer> cl = new ArrayList<>();
    cl.add(10);
    // can add but can't use index and all those were present in List interface
    List<Integer> cl1 = new ArrayList<>();
    cl1.add(1);
    cl1.add(4);
    cl1.add(2);
    cl1.sort((Integer l1, Integer l2) -> l1 - l2); // Inside it is comparator and comparable concept
    Comparator<Integer> s1 = (i, j) -> Integer.compare(i, j); // with diff sorting llogic
    Collections.sort(cl1, s1);

    ListIterator<Integer> li = cl1.listIterator();
    while (li.hasNext()) {
      System.out.println(li.next());

    }
    while (li.hasPrevious()) {
      System.out.println(li.previous());
    }

    // if you want to write your own logic for sorting then
    System.out.println(cl1);
  }
}
