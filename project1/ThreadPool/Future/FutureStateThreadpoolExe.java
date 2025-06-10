package ThreadPool.Future;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class FutureStateThreadpoolExe {
  public static void main(String[] args) {
    ThreadPoolExecutor execute = new ThreadPoolExecutor(1, 1, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<>(2),
        new Threadfactor(), new rejectedProcess());

    Future<?> futureObj = execute.submit(() -> {
      try {
        Thread.sleep(7000);
        System.out.println("Thread Executed ");
      } catch (Exception e) {
        System.out.println(e);
      }

    });
    System.out.println(futureObj.isDone());

    try {
      futureObj.get(2, TimeUnit.SECONDS);

    } catch (Exception e) {
      System.out.println("Reached Max Time");
    }

    System.out.println(futureObj.isDone());

    try {
      futureObj.get();// wait untill it done

    } catch (Exception e) {
      System.out.println("Reached Max Time");
    }
    System.out.println(futureObj.isDone());
    System.out.println(futureObj.isCancelled());
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