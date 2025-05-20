package Multithreading1;

class multithreeadingobj implements Runnable {
  public void run() {
    System.out.println("Method-1 bY implementing the runnable ");
    System.out.println(Thread.currentThread().getName());
  }
}

class ExtendingThreadClass extends Thread {
  public void run() {
    System.out.println("Method-2 bY Extending the Thread Class");
    System.out.println(Thread.currentThread().getName());
  }
}

public class Multithreading1 {
  public static void main(String[] args) {
    System.out.println(Thread.currentThread().getName());

    multithreeadingobj runnableobj = new multithreeadingobj();
    Thread thread = new Thread(runnableobj);
    thread.start();

    ExtendingThreadClass threadobj = new ExtendingThreadClass();
    threadobj.start();
    System.out.println(Thread.currentThread().getName());

  }
}
