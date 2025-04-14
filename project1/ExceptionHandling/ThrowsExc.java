package ExceptionHandling;

class Excep1 {
  public void show() throws ArithmeticException {

    int i = 2;
    int j = 10 / i;
  }
}

class Excep2 {
  public void show() throws ClassNotFoundException {

    Class.forName("srihas");
  }
}

public class ThrowsExc {
  public static void main(String[] args) {
    try {
      Excep1 obj = new Excep1();
      obj.show();

      Excep2 obj1 = new Excep2();
      obj1.show();
    } catch (Exception e) {
      System.out.print(e);
    }
  }
}
