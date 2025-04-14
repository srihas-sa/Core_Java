package Sorting;

import java.util.ArrayList;

public class BubbleSort {

  public ArrayList<Integer> sort(ArrayList<Integer> arr) {
    for (int j = arr.size() - 1; j >= 0; j--) {
      boolean alreadySorted = true;
      for (int i = 0; i < j; i++) {
        if (arr.get(i) > arr.get(i + 1)) {
          Integer temp = arr.get(i);
          arr.set(i, arr.get(i + 1));
          arr.set(i + 1, temp);
          alreadySorted = false;
        }
      }
      if (alreadySorted == true) {
        break;
      }
    }
    return arr;
  }
}
