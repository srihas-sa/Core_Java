package Interface;

interface Common {
  void hello();
}

interface Common2 {
  void hello1();
}

interface Common1 extends Common {
  void hello1();
}

class Helo implements Common1, Common2 {
  public void hello() {
    System.out.print("helo");
  }

  public void hello1() {
    System.out.print("Hello World");
  }
}

class Inter implements Common {
  public int i = 5;

  public void hello() {
    System.out.print("In Inter");
  }

}

class Inter1 implements Common {
  public void hello() {
    System.out.print("In Inter1");
  }
}

class ii {
  public void pp(Common obj) {
    obj.hello();
  }
}

public class Interf {
  public static void main(String[] args) {
    Common a = new Inter();
    Common bs = new Inter1();
    ii i = new ii();
    i.pp(a);

    Common2 c1 = new Helo();
    c1.hello1();

    // prints 5
  }
}