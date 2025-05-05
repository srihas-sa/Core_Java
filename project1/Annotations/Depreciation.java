package Annotations;

@Deprecated
class Hello {
  @Deprecated
  public void hello() {
    System.out.println("hello");
  }
}

public class Depreciation {
  public static void main(String[] args) {
    Hello c = new Hello();
    c.hello();
  }
}
