import java.util.HashMap;
import java.util.Map;

public class MapLearn {

    public static void main(String[] args) {
        Map<String, String> langs = new HashMap<>(); //key and value of type string
        langs.put("India", "Hindi, English, Kannada, Konkani");
        langs.put("France", "French");
        langs.put("United Kingdom","London");
        langs.put("Brazil", "Portugese");

        System.out.println(langs.get("India"));
    }
}
