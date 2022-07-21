public class Main {
    public static void main(String[] args) {
        System.out.println(ThreadColor.ANSI_RED+"Main Thread!");
        Thread anotherOne = new SomeThread();
        anotherOne.start();

        new Thread(){
            public void run(){
                System.out.println(ThreadColor.ANSI_PURPLE+"Anonymous thread now running!");
            }
        }.start();

        Thread myRunnable = new Thread(new MyRunnable());
        myRunnable.start();

        System.out.println("Hello Again");
        //cannot start a thread more than once.

//        anotherOne.start(); //won't work
    }
}