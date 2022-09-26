import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {

        try{
            URL url = new URL("http://example.org");

            BufferedReader inputStream = new BufferedReader(new InputStreamReader(url.openStream()));
            //            URI uri = url.toURI();
            String line = "";
            while (line!=null){
                line = inputStream.readLine();
                System.out.println(line);
            }
            inputStream.close();
        }catch (MalformedURLException e){
            e.printStackTrace();
        }catch(IOException e){
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