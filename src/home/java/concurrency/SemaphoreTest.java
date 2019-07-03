package home.java.concurrency;

import java.util.concurrent.Semaphore;

public class SemaphoreTest {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        Runnable r = () -> {
            try {
                System.out.println(Thread.currentThread().getName() + " Going to acquire thread : available = " + semaphore.availablePermits());
                semaphore.acquire();
                System.out.println(Thread.currentThread().getName() + " Going acquired thread : available = " + semaphore.availablePermits());
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(Thread.currentThread().getName() + " Going to release thread : available = " + semaphore.availablePermits());
                semaphore.release();
            }
        };

        new Thread(r).start();
        new Thread(r).start();
        new Thread(r).start();
        new Thread(r).start();
        new Thread(r).start();
        new Thread(r).start();
        new Thread(r).start();
        new Thread(r).start();
        new Thread(r).start();
        new Thread(r).start();

    }
}
