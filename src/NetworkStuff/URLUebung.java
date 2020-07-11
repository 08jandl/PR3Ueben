package NetworkStuff;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class URLUebung {
    public static void main(String[] args) {
        try{
            System.out.println("Bitte URL angeben: ");
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

            URL url = new URL(userInput.readLine());

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));

            String input;

            while((input = bufferedReader.readLine()) !=null){
                System.out.println(input);
            }
            bufferedReader.close();
        }
        catch (MalformedURLException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
