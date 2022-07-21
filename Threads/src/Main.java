public class Main {
    public static void main(String[] args) {
        System.out.println("Main Thread!");
        Thread anotherOne = new SomeThread();
        anotherOne.start();

        System.out.println("Hello Again");
    }
}