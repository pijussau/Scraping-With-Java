import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainClass {

    public static void main(String args[]) throws IOException {

        var pageSource = SocketConnection.getURLSource(("https://www.vpngate.net/en/"));

        Pattern pattern = Pattern.compile("<tr>(.*?)</tr>");
        Matcher matcher = pattern.matcher(pageSource);
        while (matcher.find()) {
            System.out.println(matcher.group(1));
            //Do what you want with match. Contiune parsing it, uploading it to database etc.
        }
    }

}
