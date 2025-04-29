package SingletonCLass;

//Eager Initialization
class SingleTOn {
  private static SingleTOn sin = new SingleTOn();

  private SingleTOn() {
  }

  public static SingleTOn getInstance() {
    return sin;
  }
}

public class SingleTOnC {
  public static void main(String[] args) {
    SingleTOn ss = SingleTOn.getInstance();
    System.out.println(ss);
  }
}
