import java.net.SocketPermission;
import java.util.ArrayList;

import PriPackage.Inside1;
import Sorting.BubbleSort;
import Sorting.InsertionSort;
import Sorting.MergeSort;
import Sorting.MergeSortWithoutArray;
import Sorting.QuickSort;

abstract class Node {
  int val;
  Node next;
  Node prev;

  Node() {

  }

  public abstract void abmethod1();

  public Node(int val, Node next, Node prev) {
    this.val = val;
    this.next = next;
    this.prev = prev;
  }

  public void hello1() {
    System.out.print("hello");
  }
}

class Outerrclass {
  static class Innerclass {
    public void show() {
      System.out.print("hello");
    }
  }
}

class Node1 extends Node {

  public void abmethod1() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'abmethod1'");
  }

}

class AdvHallo extends Inside1 {
  int marks1 = 20;

  public void hello1() {
    System.out.println(marks);
  }
}

class hello {
  public static void main(String args[]) {
    BubbleSort b1 = new BubbleSort();
    InsertionSort i1 = new InsertionSort();
    MergeSort m1 = new MergeSort();
    MergeSortWithoutArray m2 = new MergeSortWithoutArray();
    QuickSort q1 = new QuickSort();
    ArrayList<Integer> arr = new ArrayList<Integer>();
    arr.add(5);
    arr.add(4);
    arr.add(3);
    arr.add(2);
    arr.add(1);
    arr.add(3);
    q1.sort(arr, 0, arr.size() - 1);
    // m2.sort(arr, 0, arr.size() - 1);
    System.out.println(arr);

    Outerrclass ou = new Outerrclass();
    Outerrclass.Innerclass obj = new Outerrclass.Innerclass();
    System.out.print("srihas");
    System.out.print("srihas12");
  }
}
