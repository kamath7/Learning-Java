public class Main {
    public static void main(String[] args) {
        System.out.println(ThreadColor.ANSI_RED + "Main Thread!");
        Thread anotherOne = new SomeThread();
        anotherOne.setName("Lalle Thread");
        anotherOne.start();
        //anotherOne.run(); //this returns calling from the main thread. use thread.start instread run
        new Thread() {
            public void run() {
                System.out.println(ThreadColor.ANSI_PURPLE + "Anonymous thread now running!");
            }
        }.start();

        Thread myRunnable = new Thread(new MyRunnable() {
            @Override
            public void run() {
//                super.run();
                System.out.println(ThreadColor.ANSI_RED + " Anonymous class run!");
            }
        });
        myRunnable.start();

        System.out.println("Hello Again");
        //cannot start a thread more than once.

//        anotherOne.start(); //won't work
    }
}