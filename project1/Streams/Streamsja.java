package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streamsja {
  public static void main(String[] args) {
    Stream<Integer> sp = Stream.of(100, 200, 300, 400); // Filters without updating
    Stream<Integer> res = sp.filter((Integer ele) -> ele >= 200);
    // Stream<Integer> res1 = sp.sorted(); can't use same stream again

    Stream<Integer> sp1 = Stream.of(100, 200, 300, 400);
    List<Integer> arr = sp1.map((Integer ele) -> ele > 200 ? ele + 10 : ele).toList(); // Map will update each element
                                                                                       // also can add conditions
    System.out.println(arr);
    System.out.println(res.toList());

    // Also Works with Primitive datatypes like int,long,double but need to use
    // IntStream
    Stream<Integer> sp3 = Stream.of(100, 200, 300, 400);
    int[] arr2 = { 1, 2, 3, 4, 5 };
    IntStream st2 = Arrays.stream(arr2);

    ArrayList<Integer> arr3 = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
    Optional<Integer> arr4 = arr3.stream().map((Integer ele) -> ele + 2).min((Integer i1, Integer i2) -> i1 - i2);
    System.out.println(arr4.get());

  }
}
