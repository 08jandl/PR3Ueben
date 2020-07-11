package Threads_Uebung3;

public class Worker2 implements Runnable{

    public static int counter = 0;

    private final int sleepInterval = 1000; //1 Sek

    private static Object lock = new Object();

    @Override
    public void run() {

            while (counter <= 19) {
                counter++;
                System.out.println(Thread.currentThread().getName() + " Counter ---- " + counter);
            }
    }

    public void counter(int i) throws InterruptedException{
        synchronized (lock) {
            while (!lock.equals(20)){
                System.out.println(Thread.currentThread().getName() + " Counter ---- " + counter);
                    lock.wait();
        }
            try {
                Thread.sleep(sleepInterval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lock.notify();
        }
    }
}
