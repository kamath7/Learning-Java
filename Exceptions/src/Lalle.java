import java.util.InputMismatchException;
import java.util.Scanner;

public class Lalle {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int res = divide();
        System.out.println(res);
    }

    private static int divide() {
        int x = getNum();
        int y = getNum();
        System.out.println("x - >" + x + " y-> " + y);
        try {
            return x / y;

        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    private static int getNum() {
        System.out.println("Enter num");
        while(true){
            try{
                return scanner.nextInt();

            }catch(InputMismatchException e){
                e.printStackTrace();
                scanner.nextLine();
                System.out.println("Incorrect input. Add numbers only");
            }
        }
    }
}
