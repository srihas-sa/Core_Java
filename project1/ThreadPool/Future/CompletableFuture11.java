package ThreadPool.Future;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CompletableFuture11 {
  public static void main(String[] args) {
    ThreadPoolExecutor execute = new ThreadPoolExecutor(1, 1, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<>(2),
        new Threadfactor(), new rejectedProcess());

    CompletableFuture<Void> cf236 = CompletableFuture.supplyAsync(() -> {
      System.out.println("then appl" + Thread.currentThread().getName());
      return "srihas";
    }, execute).

        thenApplyAsync((String val) -> {
          System.out.println("then appl" + Thread.currentThread().getName());
          return val + "123";
        })
        .thenApplyAsync((String val) -> {
          System.out.println("then appl" + Thread.currentThread().getName());
          return val + "456";
        })
        .thenAcceptAsync((String val) -> {
          System.out.println(val + "789");
        });

    try {
      cf236.get();

    } catch (Exception e) {

    }

    execute.shutdown();

    ThreadPoolExecutor execute2 = new ThreadPoolExecutor(1, 1, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<>(2),
        new Threadfactor(), new rejectedProcess());

    CompletableFuture<String> cf123 = CompletableFuture.supplyAsync(() -> {
      System.out.println("then appl" + Thread.currentThread().getName());
      return "srihas";
    }, execute2);

    CompletableFuture<String> s23 = cf123.thenCompose((String val) -> {
      System.out.println("then appl" + Thread.currentThread().getName());
      return CompletableFuture.supplyAsync(() -> val + "123");
    });

    try {
      String cf12345 = cf123.get();
      String cf234 = s23.get();
      System.out.println(cf12345);
      System.out.println(cf234);
    } catch (Exception e) {

    }

    execute2.shutdown();

  }
}

class Threadfactor implements ThreadFactory {

  @Override
  public Thread newThread(Runnable r) {
    // TODO Auto-generated method stub
    Thread th = new Thread(r);
    th.setDaemon(false);
    th.setPriority(Thread.NORM_PRIORITY);
    return th;
  }

}

class rejectedProcess implements RejectedExecutionHandler {

  @Override
  public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
    System.out.println("Rejected the Process");
    // TODO Auto-generated method stub

  }

}
