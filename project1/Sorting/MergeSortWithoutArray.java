package Sorting;

import java.util.ArrayList;

public class MergeSortWithoutArray {
  public void sort(ArrayList<Integer> arr, int i, int j) {

    if (i == j) {
      return;
    }

    int n = (i + j) / 2;
    System.out.println(n);
    sort(arr, i, n);
    sort(arr, n + 1, j);
    Merging(arr, i, n, j);
  }

  public void Merging(ArrayList<Integer> arr, int start, int mid, int end) {
    ArrayList<Integer> ans = new ArrayList<Integer>();

    int i = start;
    int j = mid + 1;
    while (i <= mid && j <= end) {
      if (arr.get(i) <= arr.get(j)) {
        ans.add(arr.get(i));
        i++;
      } else {
        ans.add(arr.get(j));
        j++;
      }
    }
    while (i <= mid) {
      ans.add(arr.get(i));
      i++;
    }
    while (j <= end) {
      ans.add(arr.get(j));
      j++;
    }

    int kk = 0;
    System.out.println(ans);
    System.out.print(arr);
    System.out.println(start + ":" + mid + ":" + end);
    for (int il = start; il <= end; il++) {
      arr.set(il, ans.get(kk));
      kk = kk + 1;

    }

    System.out.print(arr);

  }
}
