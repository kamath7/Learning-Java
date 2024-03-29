import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        Employee nata = new Employee("Nata Nata", 69);
        Employee seere = new Employee("Seere chakka", 30);
        Employee typhy = new Employee("Typhy gay", 30);
        Employee gokesh = new Employee("Gokesh gokesh", 21);
        Employee kami = new Employee("Kami mami", 10);
        Employee pujit = new Employee("Pujit ps", 4);

        List<Employee> employees = new ArrayList<>();

        employees.add(nata);
        employees.add(seere);
        employees.add(typhy);
        employees.add(gokesh);
        employees.add(kami);
        employees.add(pujit);

        printByAge(employees, "Employees over 25", employee -> employee.getAge() > 25);
        printByAge(employees, "Employess below 25", employee -> employee.getAge() < 25);
        printByAge(employees, "Employees below 20", new Predicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return employee.getAge() < 20;
            }
        });

        IntPredicate intp = i -> i > 69;
        IntPredicate intp2 = i -> i < 100;
        System.out.println(intp.test(70));
        System.out.println(intp.test(70-6));
        System.out.println(intp.and(intp2).test(73));

        Random random = new Random();
        Supplier<Integer> supplier = () -> random.nextInt(100);
        for (int i = 0 ; i < 10 ; i++){
            System.out.println(supplier.get());
        }

        employees.forEach(employee -> {
            String lname = employee.getName().substring(employee.getName().indexOf(' ') + 1);
            System.out.println("Last Name is "+lname);
        });

        Function <Employee, String> getLastName = (Employee employee) ->{
            return employee.getName().substring(employee.getName().indexOf(' ') + 1);
        };

        String lastName = getLastName.apply(employees.get(2));
        System.out.println(lastName);

        Function <Employee, String> getFirstName = (Employee employee) ->{
            return employee.getName().substring(employee.getName().indexOf(' '));
        };
        Random random1 = new Random();
        for(Employee employee : employees){
            if (random1.nextBoolean()){
                System.out.println(getAName(getFirstName, employee));
            }else{
                System.out.println(getAName(getLastName, employee));
            }
        }

        Function<Employee, String> upperCase1 = employee -> employee.getName().toUpperCase();
        Function <String, String> firstName = name -> name.substring(0, name.indexOf(' '));
        Function chainedFunc = upperCase1.andThen(firstName);
        System.out.println(chainedFunc.apply(employees.get(0)));

        BiFunction <String, Employee, String> concatAge = (String name, Employee employee) ->{
            return name.concat(" "+employee.getAge());
        };
        String upperName = upperCase1.apply(employees.get(0));
        System.out.println(concatAge.apply(upperName, employees.get(0)));

        IntUnaryOperator incBy5 = i -> i + 5;
        System.out.println(incBy5.applyAsInt(10));

        Consumer<String> c1 = s-> s.toUpperCase();
        Consumer<String> c2 = s -> System.out.println(s);
        c1.andThen(c2).accept("Oor Lalle");

    }

    private static String getAName(Function<Employee, String> getName, Employee employee){
        return getName.apply(employee);
    }
    private static void printByAge(List<Employee> employees, String ageTxt, Predicate<Employee> ageCondition) {
        System.out.println(ageTxt);

        for (Employee employee: employees){
            if (ageCondition.test(employee)){
                System.out.println(employee.getName());
            }
        }

    }
}