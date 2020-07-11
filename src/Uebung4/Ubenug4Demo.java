package Uebung4;

public class Ubenug4Demo {
    public static void main(String[] args) {
        TimePrintWorker timePrintWorker = new TimePrintWorker("tpw");
        FilePrintWorker f = new FilePrintWorker("fpw", "addresses2.txt");

        Thread t1= new Thread(timePrintWorker);
        Thread t2 = new Thread(f);

        t1.start();
        t2.start();

        try{
            t2.join();
            timePrintWorker.stopWorker();
            t1.join();
            System.out.println("fertig");
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }


    }
}
