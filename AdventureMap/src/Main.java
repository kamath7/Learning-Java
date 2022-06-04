import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Main {

    final static Scanner scanner = new Scanner(System.in);
    private static Map<Integer,Location> locations = new HashMap<Integer, Location>();
    public static void main(String[] args) {

        Map<String, Integer> tempExits = new HashMap<String, Integer>();

        locations.put(0, new Location(0, "Computer and coding",tempExits));


        tempExits.put("W",2);
        tempExits.put("E",3);
        tempExits.put("S",4);
        tempExits.put("N",5);
        locations.put(1, new Location(1, "Napping on the bed",tempExits));

//        tempExit.put("Q",0);

        tempExits = new HashMap<String, Integer>();
        tempExits.put("N",5);
        locations.put(2, new Location(2, "Watching a movie on the sofa",tempExits));

//        tempExit.put("Q",0);

        tempExits = new HashMap<String, Integer>();
        tempExits.put("W",1);
        locations.put(3, new Location(3, "Bath time",tempExits));

//        tempExit.put("Q",0);

        tempExits = new HashMap<String, Integer>();
        tempExits.put("N",1);
        tempExits.put("W",2);
        locations.put(4, new Location(4, "Riding my bike",tempExits));

//        tempExit.put("Q",0);

        tempExits = new HashMap<String, Integer>();
        tempExits.put("S",1);
        tempExits.put("W",2);
        locations.put(5, new Location(5, "Gyming",tempExits));

//        tempExit.put("Q",0);


        Map<String, String> vocabs = new HashMap<String, String>();
        vocabs.put("QUIT","Q");
        vocabs.put("NORTH","N");
        vocabs.put("SOUTH","S");
        vocabs.put("WEST","W");
        vocabs.put("EAST","E");




        int loc = 1;
        while(true){
            System.out.println(locations.get(loc).getDescription());
            if (loc == 0){
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.println("Available exits --> ");

            for(String exit: exits.keySet()){
                System.out.println(exit + " | ");
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();
            if(direction.length() > 1){
                String[] words = direction.split(" ");
                for (String word: words){
                    if(vocabs.containsKey(word)){
                        direction = vocabs.get(word);
                        break;
                    }

                }
            }

            if(exits.containsKey(direction)){
                System.out.println("Direction valid \n");
                loc = exits.get(direction);
            }else{
                System.out.println("Cannot go towards that side");
            }
        }
    }
}