package FileUebungen.Product;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryOutput {
    public static void main(String[] args) {
        File file = new File("addresses2.txt");
        FileOutputStream fileOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream(file);

            char c;
            while ((c = (char) System.in.read()) != 'x'){
                fileOutputStream.write(c);
                System.out.println(c);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            try {
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
