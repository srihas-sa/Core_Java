package DSA.Queue;

import java.util.ArrayList;

public class QueueImpArr {
  public static void Enqueue(int[] arr, int ele, int fron, int rear) {
    if (rear <= arr.length) {
      arr[rear] = ele;
      rear++;

    }
  }

  public static void Dequeue(int[] arr, int fron, int rear) {
    if (arr[0] == 0) {
      System.out.println("Is Empty");
      return;
    }

  }

  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>();
    int arr1[] = new int[5];

    int fron = 0;
    int rear = 0;
    int ele = 1;
    Enqueue(arr1, ele, fron, rear);
    rear++;
    ele = 2;
    System.out.println(rear);
    Enqueue(arr1, ele, fron, rear);
    System.out.println(arr1[0] + "" + arr1[1]);
    rear++;
    ele = 3;
    System.out.println(rear);
    Enqueue(arr1, ele, fron, rear);
    System.out.println(arr1[0] + "" + arr1[2]);
    Dequeue(arr1, fron, rear);
  }
}
