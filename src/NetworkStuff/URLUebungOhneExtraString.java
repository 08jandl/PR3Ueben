package NetworkStuff;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLUebungOhneExtraString {
        public static void main(String[] args) {
            try{
                System.out.println("Bitte URL angeben: ");
                BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

                URL url = new URL(userInput.readLine());

                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));

                String input;

                while(bufferedReader.readLine() !=null){
                    System.out.println(bufferedReader.readLine());
                }
                bufferedReader.close();
                userInput.close();
            }
            catch (MalformedURLException e){
                e.printStackTrace();
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }
