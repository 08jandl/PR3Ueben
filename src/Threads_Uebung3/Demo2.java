package Threads_Uebung3;

public class Demo2 {
    public static void main(String[] args) {
        Worker2 w2 = new Worker2();

        Thread t3 = new Thread(w2);
        Thread t4= new Thread(w2);

        t3.start();
        t4.start();

        try{
            t3.join();
            t4.join();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Fertig");
    }
}
