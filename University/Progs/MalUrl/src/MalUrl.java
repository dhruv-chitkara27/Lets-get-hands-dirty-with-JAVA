import java.net.MalformedURLException;
import java.net.URL;

public class MalUrl {

    public static void main(String args[]) {

        try {
            URL url = new URL("http://google.com");
            System.out.println("URL PROTOCOL:" + url.getProtocol());
        }
        catch (MalformedURLException m) {
            System.out.println("Correct the protocol. " + m);

        }

    }
}
