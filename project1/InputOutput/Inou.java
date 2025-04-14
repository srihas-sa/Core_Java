package InputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Inou {
  public static void main(String[] args) throws NumberFormatException, IOException {
    // 1st Way of taking input older versions
    InputStreamReader in = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(in);
    int n = Integer.parseInt(br.readLine());
    System.out.print(n);
    // @nd way
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    sc.nextLine();
    String s = sc.nextLine();
    System.out.print(s);
  }
}
