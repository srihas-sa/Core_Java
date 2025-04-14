package ExceptionHandling;

class MyException extends Exception {
  MyException(String s) {
    super(s);
    System.out.print("hello fevv");
  }
}

public class CustomExcep {

  public static void main(String args[]) {
    int i = 0;
    try {
      if (i == 0) {
        throw new MyException("This is an Issue");
      }
      int j = 20 / i;

    } catch (MyException e) {
      System.out.print(e);
    }

    System.out.print("Hello");
  }
}
