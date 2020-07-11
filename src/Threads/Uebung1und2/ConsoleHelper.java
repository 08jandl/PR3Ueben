package Threads.Uebung1und2;

import java.util.Scanner;

public class ConsoleHelper {

    public static String readLine() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        try {
            return s;
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
