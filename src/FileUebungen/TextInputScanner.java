package FileUebungen;

import java.io.*;
import java.util.Scanner;

public class TextInputScanner {
    public static void main(String[] args) {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        try {
            String s;
            System.out.println("Bitte geben Sie ihren Text in die Konsole ein: ");
            while ((s = bufferedReader.readLine()) != null) {
                System.out.println(s);
                if(s.equals("STOP")){
                    break;
                }
            }
            System.out.println("Fertig");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
