package Multithreading1;

class CommoonResource1 {
  public synchronized void hello() {
    System.out.println("Lock Acquired b T1");
    try {
      Thread.sleep(8000);
    } catch (Exception e) {
      System.out.println(e);
    }
    System.out.println("Lock Acqu");
  }
}

public class DeamonThread {
  public static void main(String[] args) {
    CommoonResource1 cr = new CommoonResource1();
    Thread t1 = new Thread(() -> cr.hello());
    // t1.setDaemon(true);
    t1.start();

    System.out.println("Program is done ");
  }
}
