import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Employee nata = new Employee("Nata", 69);
        Employee seere = new Employee("Seere", 30);
        Employee typhy = new Employee("Typhy", 30);
        Employee gokesh = new Employee("Gokesh", 21);
        Employee kami = new Employee("Kami", 10);
        Employee pujit = new Employee("Pujit", 4);

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