package Uebung4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FilePrintWorker extends Worker implements Runnable{

    private String path;
    public ArrayList<String>lines;

    public FilePrintWorker(String name, String path) {
        super(name);
        this.path = path;
        lines = new ArrayList<>();
    }

    @Override
    protected void work() {
        try {
            FileReader fileReader = new FileReader(new File(path));
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String templine;

            while ((templine = bufferedReader.readLine()) != null) {
                if (!shouldRun) {
                    break;
                }
                lines.add(templine);
                System.out.println(templine);
                Thread.sleep(1000);
            }
            bufferedReader.close();
        }
        catch (IOException | InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    public void run() {

            printStarted();
            work();

        printStopped();

    }
}
