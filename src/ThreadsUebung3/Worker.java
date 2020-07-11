package ThreadsUebung3;

import java.io.ObjectOutputStream;

public class Worker implements Runnable{

    private static int counter = 0;
    private final int sleepInterval = 100;

    private static Object lock = new Object();

    @Override
    public void run() {
        synchronized (lock) {
            while (counter < 20) {
                lock.notifyAll();
                counter++;
                System.out.println(Thread.currentThread().getName() + ": " + counter);
                try {
                    Thread.sleep(sleepInterval);
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            lock.notifyAll();
        }
    }
}
