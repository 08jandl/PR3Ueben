package NetworkStuff;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class WriteToURLConnectionIDFKwhattodowiththis {
    public static void main(String[] args)
{
    URL url;
    try
    {
        url = new URL("http://www.wetter.at");
        URLConnection conn = url.openConnection();
        conn.setDoOutput(true);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream()));

        bw.write("GET /wetter/oesterreich/steiermark/graz/index.html HTTP/1.1");
        bw.newLine();
        bw.write("Host: www.wetter.at");
        bw.newLine();
        bw.newLine();
        bw.flush();

        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

        String line;
        while ((line = br.readLine()) != null)
        {
            System.out.println(line);
        }
    }
    catch (IOException e)
    {
        e.printStackTrace();
    }
}
}
