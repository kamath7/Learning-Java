import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<String> someNumbers = Arrays.asList("N40", "N36", "B12", "B8", "G53", "G54", "G55", "G50", "g59", "I26", "I17", "I20", "O89");
        List<String> gNums = new ArrayList<>();

        someNumbers.stream().map(String::toUpperCase).filter(s -> s.startsWith("G")).sorted().forEach(System.out::println);

        Stream<String> ioNumberStream = Stream.of("I20","I69","I89","I25");
        Stream<String> inNumberStream = Stream.of("N40","N36","I90","I10","O7","I20");
        Stream<String> concatStream = Stream.concat(ioNumberStream, inNumberStream);
        System.out.println(concatStream.count());
        //Standard approach
//        someNumbers.forEach(number -> {
//            if (number.toUpperCase().startsWith("G")) {
//                gNums.add(number);
//            }
//        });
//        gNums.sort((s1, s2) -> s1.compareTo(s2));
//        gNums.forEach((s) -> System.out.println(s));
    }
}