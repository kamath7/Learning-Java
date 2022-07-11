import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int x = validatedInput();
        int y = validatedInput();

        System.out.println(divideByANum(x, y));
        System.out.println(divideByANumAgain(x, y));
        System.out.println(iWillCrashDivide(x, y));
    }

    private static int exceptioninput() {
        System.out.println("Enter integer");
        try {
            return scanner.nextInt();

        } catch (InputMismatchException e) {
            return 0;
        }
    }

    private static int validatedInput() {
        boolean isValid = true;
        System.out.println("Enter num");
        String ip = scanner.next();
        for (int i = 0; i < ip.length(); i++) {
            if (!Character.isDigit(ip.charAt(i))) {
                isValid = false;
                break;
            }
        }
        if (isValid) {
            return Integer.parseInt(ip);
        }
        return 0;
    }

    public static int divideByANum(int x, int y) {
        if (y != 0) {
            return x / y;
        }
        return 0;
    }

    private static int divideByANumAgain(int x, int y) {
        try {
            return x / y;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        return 0;
    }

    private static int iWillCrashDivide(int x, int y) {
        return x / y;
    }
}