package ThreadPool.ThreadpoolExecutor11;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadpoolExecutor11 {
  public static void main(String[] args) {
    ThreadPoolExecutor execute = new ThreadPoolExecutor(3, 4, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<>(2),
        new Threadfactor(), new rejectedProcess());
    for (int i = 1; i <= 7; i++) {
      execute.submit(() -> {
        try {
          System.out.println("Task" + "is Exedfgsgscuted b:" + Thread.currentThread().getName());
          Thread.sleep(5000);
          System.out.println("Task" + "is Exedfgsgscuted b:" + Thread.currentThread().getName());
        } catch (Exception e) {
          System.out.println(e);
        }
        System.out.println("Task" + "is Executed b:" + Thread.currentThread().getName());

      });
      System.out.println("Task" + "is Executed bdfff:" + Thread.currentThread().getName());
    }
    execute.shutdown();
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