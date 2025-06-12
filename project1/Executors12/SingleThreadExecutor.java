package Executor;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

public class SingleThreadExecutor {
  public static void main(String[] args) {
    // ExecutorService es = Executors.newSingleThreadExecutor();

    // ExecutorService es1 = Executors.newCachedThreadPool();
    // ExecutorService es2 = Executors.newFixedThreadPool(2);
    // ExecutorService es3 = Executors.newWorkStealingPool();
    ForkJoinPool f1 = ForkJoinPool.commonPool();
    Future<Integer> f2 = f1.submit(new Recursive1(0, 10));
    int ans = 0;
    try {
      ans = f2.get();
    } catch (Exception e) {

    }
    System.out.println(ans);
    f1.shutdown();
  }

}

class Recursive1 extends RecursiveTask<Integer> {
  int a;
  int b;

  Recursive1(int a, int b) {
    this.a = a;
    this.b = b;
  }

  @Override
  protected Integer compute() {
    if (a == b) {
      return a;
    }
    int c = (a + b) / 2;
    Recursive1 l1 = new Recursive1(a, c);
    Recursive1 r1 = new Recursive1(c, b);
    l1.fork();
    r1.fork();
    int leftSum = l1.join();
    int rightSum = r1.join();
    return leftSum + rightSum;
  }

}
