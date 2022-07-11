public class Main {
    public static void main(String[] args) {

        int x = 10;
        int y= 0;

        System.out.println(divideByANum(x,y));
        System.out.println(divideByANumAgain(x,y));
    }

    public static int divideByANum(int x, int y){
        if (y != 0){
            return x / y ;
        }
        return 0;
    }

    private static int divideByANumAgain(int x, int y){
        try {
            return x / y;
        }catch(ArithmeticException e){
            System.out.println(e);
        }
        return 0;
    }
}