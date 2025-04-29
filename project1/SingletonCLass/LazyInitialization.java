package SingletonCLass;

import javax.sound.sampled.SourceDataLine;

class Lazyinit {
  private static Lazyinit sin;

  private Lazyinit() {
  }

  public static Lazyinit getInstance() {
    if (sin == null) {
      sin = new Lazyinit();
    }
    return sin;
  }
}

public class LazyInitialization {
  public static void main(String[] args) {

    Lazyinit lz = Lazyinit.getInstance();
    System.out.println(lz);
  }

}
