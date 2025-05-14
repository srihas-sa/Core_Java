package Collections;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Queue;
import java.util.concurrent.DelayQueue;

public class Dequeue {
  public static void main(String[] args) {
    Deque<Integer> cl = new ArrayDeque<>();
    cl.add(1);
    cl.addFirst(0);
    cl.addLast(2);
    cl.removeFirst();
    cl.removeLast();
    cl.getFirst();
    cl.getLast();
    System.out.println(cl);
  }
}
