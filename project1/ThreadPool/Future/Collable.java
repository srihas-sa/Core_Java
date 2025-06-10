package ThreadPool.Future;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class MyCallable implements Callable<String> {
  @Override
  public String call() throws Exception {
    Thread.sleep(2000); // simulate delay
    return "srihas";
  }
}

public class Collable {
  public static void main(String[] args) {
    ThreadPoolExecutor execute = new ThreadPoolExecutor(1, 1, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<>(2),
        new Threadfactor(), new rejectedProcess());

    String output = "";

    Future<String> futureObj = execute.submit(new MyCallable());
    try {
      String s = futureObj.get();
      System.out.println(s);
    } catch (Exception E) {

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