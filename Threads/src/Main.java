public class Main {
    public static void main(String[] args) {
        System.out.println("Main Thread!");
        Thread anotherOne = new SomeThread();
        anotherOne.start();

        new Thread(){
            public void run(){
                System.out.println("Anonymous thread now running!");
            }
        }.start();

        System.out.println("Hello Again");
        //cannot start a thread more than once.

//        anotherOne.start(); //won't work
    }
}