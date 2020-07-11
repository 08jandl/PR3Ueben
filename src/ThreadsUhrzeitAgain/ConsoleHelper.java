package ThreadsUhrzeitAgain;

import java.util.Scanner;

public class ConsoleHelper {

    public static String readFromScanner() {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        try {
            return s;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


}
