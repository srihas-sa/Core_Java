package SingletonCLass;

class Billplug {

  private Billplug() {
  }

  private static class createObject {
    private static final Billplug INSTANCE_OBJECT = new Billplug();

  }

  public static Billplug getinstance() {
    return createObject.INSTANCE_OBJECT;
  }
}

public class BillPlugSol {
  public static void main(String[] args) {
    Billplug bi = Billplug.getinstance();
    System.out.println(bi);
    Billplug bi2 = Billplug.getinstance();
    System.out.println(bi2);
  }
}
