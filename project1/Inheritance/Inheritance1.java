package Inheritance;

class Parentclass {
  Parentclass() {
    System.out.println("inside ParentClass Constructor");
  }

  public void hello() {
    System.out.println("hello");
  }
}

class Childclass extends Parentclass {

  Childclass() {
    super();
    System.out.println("inside ChildClass Constructor");
  }

  public void hello() {

    System.out.println("hello12");
  }
}

public class Inheritance1 {
  public static void main(String[] args) {
    Childclass c = new Childclass();
    c.hello();
  }
}
