package Uebung4;

import java.io.IOException;

public abstract class Worker {
    protected String name;
    protected boolean shouldRun;

    public Worker(String name) {
        this.name = name;
        shouldRun = true;
    }

    protected abstract void work() throws InterruptedException, IOException;

    protected void printStarted(){
        System.out.print(name);
        System.out.print(" wurde gestartet.");
    }

    protected void printStopped(){
        System.out.print(name);
        System.out.println(" wurde gestoppt.");
    }

    public void stopWorker(){
        shouldRun = false;
    }

}
