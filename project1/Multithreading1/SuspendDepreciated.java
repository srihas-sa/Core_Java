package Multithreading1;

import java.sql.Time;

class CommoonResource {
  public synchronized void hello() {
    System.out.println("Lock Acquired b T1");
    try {
      Thread.sleep(3000);
    } catch (Exception e) {
      System.out.println(e);
    }
    System.out.println("Lock Acqu");
  }
}

public class SuspendDepreciated {
  public static void main(String[] args) {
    CommoonResource cr = new CommoonResource();
    Thread t1 = new Thread(() -> cr.hello());
    Thread t2 = new Thread(() -> cr.hello());
    t1.start();
    t2.start();
    t1.suspend(); // Deadliock t1 wont release the lock but t2 is waitinng fot the lock/.
    t1.resume();
    try {
      t1.join(); // Waits untill the current thread is running then onl go further .Used when we
                 // definiatel finish perticular task
    } catch (Exception e) {
    }

  }
}
