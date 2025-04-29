package GeneticFunctionalInterfaces;

interface Inter2<T, R> {
  public R hello(T r);
}

public class TypesofFunc {
  public static void main(String[] args) {

    Inter2<Integer, String> a = new Inter2<Integer, String>() {
      public String hello(Integer r) {
        System.out.println("hello" + r);
        return "helllo" + r;
      }
    };
    System.out.println(a.hello(2));
  }
}
