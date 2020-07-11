package FileUebungen;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TextInput {
    public static void main(String[] args) {

        File file = new File("addresses2.txt");

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String s;
            while((s = bufferedReader.readLine()) != null){
                System.out.println(s);
            }

            bufferedReader.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
