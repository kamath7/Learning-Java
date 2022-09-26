import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        try {
            URI baseUri = new URI("http://username:password@myserver.com:5000");
            URI uri = new URI("/catalogue/clothes?shoes=running#nike");
            URI resolvedURI = baseUri.resolve(uri);
//            uri = new URI("hello");
            URL url = resolvedURI.toURL();
            System.out.println("URL from URI is "+url);
            System.out.println("Scheme = "+uri.getScheme());
            System.out.println("Scheme - specific part"+uri.getSchemeSpecificPart());
            System.out.println("Authority "+uri.getAuthority());
            System.out.println("User info "+uri.getUserInfo());
            System.out.println("Host - "+uri.getHost());
            System.out.println("Port - "+uri.getPort());
            System.out.println("Path "+uri.getPath());
            System.out.println("Query "+uri.getQuery());
            System.out.println("Fragment "+uri.getFragment());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }catch(MalformedURLException e){
            e.printStackTrace();
        }
    }
}