package FileUebungen;

import java.io.*;

public class ScannerWritingNoten {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        FileWriter fileWriter = new FileWriter(new File("Noten.txt"));

        String s;
        System.out.println("Geben Sie die erste Note ein!");
        while ((s = bufferedReader.readLine()) != null){
            System.out.println("Geben Sie die nächste Note ein!");
            fileWriter.write(s);
            System.out.println(s);
            if(s.equals("STOP")){
                System.out.println("Stopping Programm now.");
                break;
            }
        }
    }
}

