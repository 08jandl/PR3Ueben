package ThreadsUhrzeitAgain;

import java.util.Date;

public class Worker implements Runnable{
    private boolean isRunning = true;
    private final int sleepInterval = 1000;

    public void requestShutdown(){
        isRunning = false;
    }

    public void run(){
        while (isRunning){
            Date d = new Date();
            System.out.println(d.toString());

        try{
            Thread.sleep(sleepInterval);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        }
    }
}
