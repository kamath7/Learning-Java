import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        try {
            URL url = new URL("http://example.org/somepage.html");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("User-Agent", "Chrome");


            int responseCode = connection.getResponseCode();
            System.out.println("Response code - " + responseCode);
            connection.setReadTimeout(30000);

            if (responseCode != 200) {
                System.out.println("Error in reading webpage");
                return;
            }

            BufferedReader inputStream = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String line = "";
            while ((line = inputStream.readLine()) != null)  {
                System.out.println(line);
            }
            inputStream.close();
            //            URLConnection connection = url.openConnection();


//            connection.setDoOutput(true);
//            connection.connect();
            ;

//            BufferedReader inputStream = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//            //            URI uri = url.toURI();
//
//            Map<String, List<String>> headerFields = connection.getHeaderFields();
//            for(Map.Entry<String, List<String>> entry: headerFields.entrySet()){
//                String key = entry.getKey();
//                List<String> val = entry.getValue();
//                System.out.println("----Key -> "+key);
//
//                for(String string: val){
//                    System.out.println("Value -> "+val);
//                }
//            }
//            String line = "";
//            while (line != null) {
//                line = inputStream.readLine();
//                System.out.println(line);
//            }
//            inputStream.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//            System.out.println("Scheme = " + uri.getScheme());
//            System.out.println("Scheme - specific part" + uri.getSchemeSpecificPart());
//            System.out.println("Authority " + uri.getAuthority());
//            System.out.println("User info " + uri.getUserInfo());
//            System.out.println("Host - " + uri.getHost());
//            System.out.println("Port - " + uri.getPort());
//            System.out.println("Path " + uri.getPath());
//            System.out.println("Query " + uri.getQuery());
//            System.out.println("Fragment " + uri.getFragment());