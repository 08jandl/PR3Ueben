package Uebung4;

import java.util.Date;

public class TimePrintWorker extends Worker implements Runnable{


    public TimePrintWorker(String name) {
        super(name);
    }

    @Override
    public void work() {
            Date d = new Date();
            System.out.println(d.toString());
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }


    @Override
    public void run() {
        printStarted();
        while(shouldRun){
            work();
        }
        printStopped();
    }
}
