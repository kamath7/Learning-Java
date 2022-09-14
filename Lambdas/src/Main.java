import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        new Thread(() -> {
            System.out.println("Printing from runnable");
            System.out.println("Multi line lambda");
        }).start();

        Employee nata = new Employee("Nata", 69);
        Employee seere = new Employee("Seere",30);
        Employee typhy = new Employee("Typhy", 30);
        Employee gokesh = new Employee("Gokesh", 21);

        List<Employee> employees = new ArrayList<>();
        employees.add(nata);
        employees.add(seere);
        employees.add(typhy);
        employees.add(gokesh);

//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee emp1, Employee emp2) {
//                return emp1.getName().compareTo(emp2.getName());
//            }
//        });

        Collections.sort(employees, ( emp1,  emp2) -> emp1.getName().compareTo(emp2.getName()));
        for (Employee employee: employees){
            System.out.println(employee.getName());
        }
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}