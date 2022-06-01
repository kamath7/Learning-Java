import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Main {

    final static Scanner scanner = new Scanner(System.in);
    private static Map<Integer,Location> locations = new HashMap<Integer, Location>();
    public static void main(String[] args) {
        locations.put(0, new Location(0, "Computer and coding"));
        locations.put(1, new Location(1, "Napping on the bed"));
        locations.put(2, new Location(2, "Watching a movie on the sofa"));
        locations.put(3, new Location(3, "Bath time"));
        locations.put(4, new Location(4, "Riding my bike"));
        locations.put(5, new Location(5, "Gyming"));

        int loc = 1;

        while(true){
            System.out.println(locations.get(loc).getDescription());
            if (loc == 0){
                break;
            }

            loc = scanner.nextInt();
            if (!locations.containsKey(loc)){
                System.out.println("Direction invalid");
            }
        }
    }
}