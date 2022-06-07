import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Double> squareOfNos = new HashSet<Double>();
        Set<Double> cubesOfNos = new HashSet<Double>();

        for (double i = 1; i <= 100; i++) {
            squareOfNos.add(Math.pow(i, 2));
            cubesOfNos.add(Math.pow(i, 3));
        }

        System.out.println("Size of Squares is "+squareOfNos.size() + ". Size of Cubes is "+cubesOfNos.size());
        Set<Double> union = new HashSet<>(squareOfNos);
        union.addAll(cubesOfNos);
        System.out.println("Union contains "+union.size());

        Set<Double> intersection = new HashSet<Double>(squareOfNos);
        intersection.retainAll(cubesOfNos);
        System.out.println("Intersection contains "+intersection.size()+" elements");

        for(double element: intersection){
            System.out.println(element+ " is sqrt of "+Math.sqrt(element) + " and cube of "+Math.cbrt(element));
        }

        Set<String> words = new HashSet<>();

        String sentence = "the quick brown fox jumped over the lazy dog";
        String[] arrWord = sentence.split(" ");
        words.addAll(Arrays.asList(arrWord));

        for(String s : words){
            System.out.println(s);
        }

        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();

        String[] arrWords1 = {"all","nature", "is","but","art","unknown","to","thee"};

        nature.addAll(Arrays.asList(arrWords1));
        String[] divineWords = {"to","err","is","human","to","forgive","divine"};

        divine.addAll(Arrays.asList(divineWords));

        System.out.println("nature - divine -> ");
        Set<String> diff1 = new HashSet<>(nature);
        diff1.removeAll(divine);
        printTheSet(diff1);

        System.out.println("divine - nature ->");
        Set<String> diff2 = new HashSet<>(divine);
        diff2.removeAll(nature);
        printTheSet(diff2);

    }
    private static void printTheSet(Set<String> set){
        System.out.println("\t");

        for(String s: set){
            System.out.println(s+ " ");
        }
        System.out.println();
    }
}