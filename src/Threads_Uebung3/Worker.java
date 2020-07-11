package Threads_Uebung3;

public class Worker implements Runnable{

    public static int counter = 0;

    private final int sleepInterval = 100; //1000 = 1 Sek

    private static Object lock = new Object();

    @Override
    public void run() {
        synchronized (lock) {
            while (counter <= 19) {
                lock.notifyAll();//geht auch mit nur .notify solange es um <2 Threads geht
                counter++;
                System.out.println(Thread.currentThread().getName() + " Counter ---- " + counter);

                try {
                    Thread.sleep(sleepInterval);
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                lock.notifyAll(); //sonst endet das Programm nie
            }
        }
    }
}
