package NetworkStuff;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class URLReadFromFileAndWriteToHTML {
    public static void main(String[] args) {
        try {
            BufferedReader userInput = new BufferedReader(new FileReader(new File("url.txt")));
            URL url = new URL(userInput.readLine());
            BufferedReader in = new BufferedReader((new InputStreamReader(url.openStream())));

            String input;

            PrintWriter pw = new PrintWriter("content1.html");

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
