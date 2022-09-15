import java.util.ArrayList;
import java.util.List;
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