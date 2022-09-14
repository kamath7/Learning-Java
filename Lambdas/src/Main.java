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
        System.out.println("__________________________");

        System.out.println("For Loop");

        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            System.out.println(employee.getName());
            new Thread(() -> System.out.println(employee.getAge())).start();
        }
        System.out.println("_______________________");
        for (Employee emp : employees) {
            System.out.println(emp.getName());
            new Thread(() -> System.out.println(emp.getAge())).start();
        }

        System.out.println("_______________________");
        employees.forEach(employee -> {
            System.out.println(employee.getName());
            System.out.println(employee.getAge());
        });
        System.out.println("_______________________");
        Collections.sort(employees, (emp1, emp2) -> emp1.getName().compareTo(emp2.getName()));
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }

        AnotherOne anotherOne = new AnotherOne();
        String lal = anotherOne.doSomething();
        System.out.println(lal);
    }

    public final static String stringey(UpperConcat uc, String s1, String s2) {
        return uc.upperAndConcat(s1, s2);
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

interface UpperConcat {
    public String upperAndConcat(String s1, String s2);

}

class AnotherOne {

    public String doSomething() {

        int i = 0;
//        i++;  - will result in java: local variables referenced from a lambda expression must be final or effectively final
        UpperConcat uc = (s1, s2) -> {
            System.out.println("I'm a lambda. My name is " + getClass().getSimpleName());
            System.out.println("i in lambda is " + i);
            String res = s1.toUpperCase() + s2.toUpperCase();
            return res;
        };
//        System.out.println(res); -> Won't work
        return Main.stringey(uc, "String1", "String2");
    }

    public void printVal() {
        int someNum = 25;

        Runnable r = () -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Value is " + someNum);
        };

        new Thread(r).start();
    }
}

//         int i = 0; // needs to be final because doesn't belong to the anon class
//        {
//            UpperConcat uc = new UpperConcat() {
//                @Override
//                public String upperAndConcat(String s1, String s2) {
//                    System.out.println("within anon class "+i);
//                    return s1.toUpperCase() + s2.toUpperCase();
//                }
//            };
////            i++;
//            System.out.println("value is "+i);
//            System.out.println("Outside lambda. My name is "+getClass().getSimpleName());
//            return Main.stringey(uc, "String1","String2");
//
//        }


//        System.out.println("My name is "+getClass().getSimpleName());//'AnotherOne'
//
//        return Main.stringey(new UpperConcat() {
//            @Override
//            public String upperAndConcat(String s1, String s2) {
//                System.out.println("My name is "+getClass().getSimpleName());// ''
//
//                return s1.toUpperCase() + s2.toUpperCase();
//            }
//        }, "String1", "String2");