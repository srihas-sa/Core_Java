package Sorting;

import java.util.ArrayList;

public class InsertionSort {

  public void sort(ArrayList<Integer> arr) {

    for (int i = 1; i < arr.size() - 1; i++) {
      int j = i;
      while (arr.get(j) < arr.get(j - 1) && j >= 0) {
        Integer temp = arr.get(j);
        arr.set(j, arr.get(j - 1));
        arr.set(j - 1, temp);
        j = j - 1;
      }

    }

  }
}
