public class Main {
    public static void main(String[] args) {

        new Thread(() -> System.out.println("Printing from runnable")).start();
    }
}

class CodeRun implements Runnable {
    @Override
    public void run() {
        System.out.println("Printing...");
    }
}