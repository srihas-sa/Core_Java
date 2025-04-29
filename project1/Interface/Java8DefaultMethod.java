package Interface;

interface DefaultMethod {

  public void hello();

  default int hello1() {
    return 1;
  }

}

class B implements DefaultMethod {
  public void hello() {
    System.out.println("Hello");
  }
}

public class Java8DefaultMethod {
  public static void main(String[] args) {
    DefaultMethod d = new B();
    d.hello();
    int l = d.hello1();
    System.out.println(l);
  }
}
