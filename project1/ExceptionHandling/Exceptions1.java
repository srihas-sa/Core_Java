package ExceptionHandling;

public class Exceptions1 extends Exception {
  public static void main(String args[]) {
    int i = 0;
    try {
      if (i == 0) {
        throw new ArithmeticException();
      }
      int j = 20 / i;

    } catch (ArithmeticException e) {
      System.out.print(e);
    }

    System.out.print("Hello");
  }
}
