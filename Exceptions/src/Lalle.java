import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Lalle {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            int res = divide();
            System.out.println(res);
        } catch (NoSuchElementException e) {
            throw new ArithmeticException("Incorrect input");
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Dividing by zero is a crime");
        }
    }

    private static int divide() {

        int x = getNum();
        int y = getNum();
        System.out.println("x - >" + x + " y-> " + y);
        return x / y;

    }

    private static int getNum() {
        System.out.println("Enter num");
        while (true) {
            try {
                return scanner.nextInt();

            } catch (InputMismatchException e) {
                e.printStackTrace();
                scanner.nextLine();
                System.out.println("Incorrect input. Add numbers only");
            }
        }
    }
}
