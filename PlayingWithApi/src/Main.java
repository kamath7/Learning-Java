import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {

        try {
            URL url = new URL("https://www.flickr.com/services/feeds/photos_public.gne?tags=dogs");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("User-Agent", "Chrome");
            connection.setReadTimeout(30000);

            int resCode = connection.getResponseCode();
            System.out.println("Response code " + resCode);

            if (resCode != 200) {
                System.out.println("Error reading");
                System.out.println("Message " + connection.getResponseMessage());
            }

            BufferedReader inputReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line = "";

            while ((line = inputReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}