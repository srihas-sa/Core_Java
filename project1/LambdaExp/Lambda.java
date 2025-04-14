package LambdaExp;

interface A {
  public void show();
}

interface B {
  public void show(int i);
}

interface R {
  public int show(int i);
}

public class Lambda {
  public static void main(String args[]) {
    // 1st--> Way of defining Lambda Expressions
    A obj = new A() {
      public void show() {
        System.out.println("Hello Lambda");
      }
    };
    obj.show();
    // 2nd--> Way of defining Lambda Expressions
    A obj1 = () -> System.out.println("Hello in Lambda2");
    obj1.show();

    // Lambda expr with parameters
    B obj2 = new B() {
      public void show(int i) {
        System.out.println("Hello Lambda" + i);
      }
    };
    obj2.show(5);

    B obj3 = (i) -> System.out.println("Hello in Lambda2" + i);
    obj3.show(10);

    // Lambda Expressions with Return Types

    R obj4 = new R() {
      public int show(int i) {
        System.out.println("Hello Lambda" + i);
        i++;
        return i;
      }
    };

    int ret = obj4.show(5);
    System.out.print(ret);

    R obj6 = (i) -> i++;

    int ret1 = obj6.show(5);
    System.out.print(ret1);
  }

}
