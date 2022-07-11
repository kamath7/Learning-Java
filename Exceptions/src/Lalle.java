import java.util.Scanner;

public class Lalle {
    final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int res = divide();
        System.out.println(res);
    }

    private static int divide(){
        int x = getNum();
        int y = getNum();
        System.out.println("x - >" +x + " y-> "+y);
        return x/y;
    }
    private static int getNum(){
        System.out.println("Enter num");
        return  scanner.nextInt();
    }
}
