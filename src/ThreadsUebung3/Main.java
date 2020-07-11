package ThreadsUebung3;

public class Main {
    public static void main(String[] args) {

        Worker worker = new Worker();
        Thread t1 = new Thread(worker);
        Thread t2 = new Thread(worker);

        t1.start();
        t2.start();


        try{
            t1.join();
            t2.join();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
