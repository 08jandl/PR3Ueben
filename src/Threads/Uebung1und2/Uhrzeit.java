package Threads.Uebung1und2;

import java.util.Date;

public class Uhrzeit implements Runnable{

    private boolean isRunning = true;
    private static Object lock = new Object();


    @Override
    public void run() {
        while(isRunning) {
            synchronized (lock) {
                Date d = new Date();
                System.out.print("[");
                System.out.print(d.toString());
                System.out.print(", CPUs: ");
                System.out.print(Runtime.getRuntime().availableProcessors());
                System.out.print(", FreeMem: ");
                System.out.print(Runtime.getRuntime().freeMemory());
                System.out.print("]");
                System.out.println(" ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void requestShutdown (){
        isRunning=false;
    }
}
