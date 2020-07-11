package ThreadsUhrzeitAgain;

public class Main {
    public static void main(String[] args) {

        Worker w = new Worker();
        Thread t = new Thread(w);

        t.start();

        System.out.println("Press any Key + Enter to stop");


        if(ConsoleHelper.readFromScanner() != null){
            w.requestShutdown();
        }

        try{
            t.join();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Done");
    }
}
