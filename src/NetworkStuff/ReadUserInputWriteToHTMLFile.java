package NetworkStuff;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class ReadUserInputWriteToHTMLFile {
    public static void main(String[] args) {
        try {
            System.out.println("URL eigeben: ");
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            URL url = new URL(userInput.readLine());
            BufferedReader in = new BufferedReader((new InputStreamReader(url.openStream())));

            String input;

            PrintWriter pw = new PrintWriter("content.html");

            while ((input = in.readLine()) != null) {
                pw.println(input);
            }
            in.close();
            pw.flush();
            pw.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
