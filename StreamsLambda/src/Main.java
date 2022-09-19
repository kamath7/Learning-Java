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
//        System.out.println(concatStream.count());
//        System.out.println(concatStream.distinct().count());
        System.out.println(concatStream.distinct().peek(System.out::println).count());

        //Standard approach
//        someNumbers.forEach(number -> {
//            if (number.toUpperCase().startsWith("G")) {
//                gNums.add(number);
//            }
//        });
//        gNums.sort((s1, s2) -> s1.compareTo(s2));
//        gNums.forEach((s) -> System.out.println(s));

        Employee lalle1 = new Employee("Lalle1",30);
        Employee lalle2 = new Employee("Lalle2",20);
        Employee lalle3 = new Employee("Lalle3",90);
        Employee lalle4 = new Employee("Lalle4",46);
        Employee lalle5 = new Employee("Lalle5",22);
        Employee lalle6 = new Employee("Lalle6",31);

        Department hr = new Department("HR");
        hr.addEmployee(lalle1);
        hr.addEmployee(lalle2);
        hr.addEmployee(lalle4);
        Department dev = new Department("DEV");
        dev.addEmployee(lalle3);
        dev.addEmployee(lalle5);
        dev.addEmployee(lalle6);

        List<Department> departments = new ArrayList<>();
        departments.add(hr);
        departments.add(dev);

        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .forEach(System.out::println);
    }
}