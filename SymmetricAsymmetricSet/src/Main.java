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

    }
}