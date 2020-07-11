package FileUebungen;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.channels.ScatteringByteChannel;

public class TextOutput {
    public static void main(String[] args) {
        File file = new File("WishItWereAlreadyOver.txt");
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;

        try {
            fileWriter = new FileWriter(file);
            printWriter = new PrintWriter(fileWriter);

            printWriter.println("write something here");
            printWriter.checkError();
            printWriter.flush();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally{
            printWriter.close();
        }
    }

}
