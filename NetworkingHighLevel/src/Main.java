import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        try {
            URI baseUri = new URI("http://username:password@myserver.com:5000");
            URI uri1 = new URI("/catalogue/clothes?shoes=running#nike");
            URI uri2 = new URI("/catalogue/tvs?led=gppd#sansui");
            URI uri3 = new URI("/catalogue/phones?os=android#moto");
            URI resolvedURI1 = baseUri.resolve(uri1);
            URI resolvedURI2 = baseUri.resolve(uri2);
            URI resolvedURI3 = baseUri.resolve(uri3);

            URL url1 = resolvedURI1.toURL();
            System.out.println("URL from URI1 is "+url1);

            URL url2 = resolvedURI2.toURL();
            System.out.println("URL from URI2 is "+url2);

            URL url3 = resolvedURI3.toURL();
            System.out.println("URL from URI3 is "+url3);
//            System.out.println("Scheme = "+uri.getScheme());
//            System.out.println("Scheme - specific part"+uri.getSchemeSpecificPart());
//            System.out.println("Authority "+uri.getAuthority());
//            System.out.println("User info "+uri.getUserInfo());
//            System.out.println("Host - "+uri.getHost());
//            System.out.println("Port - "+uri.getPort());
//            System.out.println("Path "+uri.getPath());
//            System.out.println("Query "+uri.getQuery());
//            System.out.println("Fragment "+uri.getFragment());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }catch(MalformedURLException e){
            e.printStackTrace();
        }
    }
}