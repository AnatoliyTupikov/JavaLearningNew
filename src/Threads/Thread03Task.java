package Threads;


import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread03Task implements Runnable{
    static Counter inst = new Counter();
    static CountDownLatch latch = null;

    @Override
    public void run() {
        for(int i = 1; i <= 1000; i++){
            inst.increment();
        }
        if (latch != null) latch.countDown();
    }

    public static void spawnThreads (int countOfThreads){
        ExecutorService executorService = Executors.newFixedThreadPool(countOfThreads);
        latch = new CountDownLatch(countOfThreads);
        for (int i = 1; i <=countOfThreads; i++ ){
                executorService.submit(new Thread03Task());
            }
        try {
            latch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
