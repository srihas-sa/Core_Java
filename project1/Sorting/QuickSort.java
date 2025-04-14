package Sorting;

import java.util.ArrayList;

public class QuickSort {
  public void sort(ArrayList<Integer> arr, int start, int end) {
    if (start >= end) {
      return;
    }
    int initial = arr.get(start);
    int s = start;
    int e = end;
    while (s < e) {
      while (s <= end - 1 && arr.get(s) <= initial) {
        s++;
      }
      while (e >= start + 1 && arr.get(e) > initial) {
        e--;
      }

      if (s < e) {
        int temp = arr.get(s);
        arr.set(s, arr.get(e));
        arr.set(e, temp);

      }
      int temp = arr.get(start);
      arr.set(start, arr.get(e));
      arr.set(e, temp);
    }
    System.out.print(arr);
    System.out.print(s);

    sort(arr, start, e - 1);
    sort(arr, e + 1, end);
  }
}
