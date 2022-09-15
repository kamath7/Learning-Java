import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Employee nata = new Employee("Nata", 69);
        Employee seere = new Employee("Seere", 30);
        Employee typhy = new Employee("Typhy", 30);
        Employee gokesh = new Employee("Gokesh", 21);

        List<Employee> employees = new ArrayList<>();
        employees.add(nata);
        employees.add(seere);
        employees.add(typhy);
        employees.add(gokesh);
        System.out.println("From special for loop");

        for (Employee emp : employees) {
            System.out.println(emp.getName());
            new Thread(() -> System.out.println(emp.getAge())).start();
        }
    }
}