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
        locations.get(1).addExit("W",2);
        locations.get(1).addExit("E",3);
        locations.get(1).addExit("S",4);
        locations.get(1).addExit("N",5);
//        locations.get(1).addExit("Q",0);

        locations.get(2).addExit("N",5);
//        locations.get(2).addExit("Q",0);

        locations.get(3).addExit("W",1);
//        locations.get(3).addExit("Q",0);

        locations.get(4).addExit("N",1);
        locations.get(4).addExit("W",2);
//        locations.get(4).addExit("Q",0);

        locations.get(5).addExit("S",1);
        locations.get(5).addExit("W",2);
//        locations.get(5).addExit("Q",0);


        Map<String, String> vocabs = new HashMap<String, String>();
        vocabs.put("QUIT","Q");
        vocabs.put("NORTH","N");
        vocabs.put("SOUTH","S");
        vocabs.put("WEST","W");
        vocabs.put("EAST","E");





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