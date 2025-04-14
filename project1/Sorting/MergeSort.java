package Sorting;

import java.util.ArrayList;

public class MergeSort {
  public ArrayList<Integer> sort(ArrayList<Integer> arr) {

    if (arr.size() == 1) {
      return arr;
    }
    int i = 0;
    int j = arr.size();
    int n = (i + j) / 2;

    ArrayList<Integer> left = sort(new ArrayList<>(arr.subList(i, n)));
    System.out.print(left);

    ArrayList<Integer> right = sort(new ArrayList<>(arr.subList(n, j)));
    ArrayList<Integer> merging = Merging(left, right);
    return merging;
  }

  public ArrayList<Integer> Merging(ArrayList<Integer> ll, ArrayList<Integer> rr) {
    ArrayList<Integer> ans = new ArrayList<Integer>();

    int llsize = ll.size();
    int rrsize = rr.size();
    int i = 0;
    int j = 0;
    while (i < llsize && j < rrsize) {
      if (ll.get(i) <= rr.get(j)) {
        ans.add(ll.get(i));
        i++;
      } else {
        ans.add(rr.get(j));
        j++;
      }
    }
    while (i < llsize) {
      ans.add(ll.get(i));
      i++;
    }
    while (j < rrsize) {
      ans.add(rr.get(j));
      j++;
    }
    return ans;

  }

}
