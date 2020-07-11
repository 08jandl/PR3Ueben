package Threads.Uebung1und2;

public class main {
    public static void main(String[] args) {
        Uhrzeit u1 = new Uhrzeit();

        Thread t1 = new Thread(u1);
        Thread t2 = new Thread(u1);

        t1.start();
        t2.start();

        System.out.println("Tastendruck zum Stoppen");

        String s = ConsoleHelper.readLine();
        System.out.println(s);

        if(ConsoleHelper.readLine() != null){
            u1.requestShutdown();
        }

        try{
            t1.join();
            t2.join();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Done");
    }
}
