package FileUebungen;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ZeichenEinlesenUndZählen {
    public static void main(String[] args) throws IOException {
        File file = new File("products.txt");
        FileInputStream fileInputStream = new FileInputStream(file);

        int byteRead;
        int counter = 0;

        while((byteRead = fileInputStream.read()) != -1){
            char[] ch = Character.toChars(byteRead);
            System.out.println(ch[0]);
            counter++;
        }

        System.out.println(counter);
    }
}
