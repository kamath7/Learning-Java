import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Without use of generics
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);
        //problematic but valid without specifying type
//        items.add("Kams");



        doubler(items);


    }

    private static void doubler(ArrayList<Integer> n){
        for(int i: n){
            System.out.println( i * 2);
        }
    }
}