package Executors12;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPool12 {
  public static void main(String[] args) {
    ScheduledExecutorService ex = Executors.newScheduledThreadPool(4);
    Future<?> futureObj = ex.scheduleWithFixedDelay(() -> {
      System.out.println("hello");
      try {
        Thread.sleep(3000);
      } catch (Exception e) {

      }
    }, 1, 5, TimeUnit.SECONDS);
    System.out.println("This is srihas");
    try {

      Thread.sleep(8000);
      futureObj.cancel(true);
      ex.shutdown();
    } catch (Exception e) {

    }

    try {
      boolean is_terminted = ex.awaitTermination(2, TimeUnit.SECONDS);
      System.out.println(is_terminted);
    } catch (Exception e) {

    }
    System.out.println("Main is done");
  }
}
