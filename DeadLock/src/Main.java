public class Main {

    public static Object lock1 = new Object();
    public static Object lock2 = new Object();


    public static void main(String[] args) {

        System.out.println("Hello world!");
    }
    private static class Thread1 extends  Thread {
        @Override
        public void run() {
            synchronized (Main.lock1){
                System.out.println("Thread 1: Enabled lock1");
                try{
                    Thread.sleep(100);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("Thread 1: Waiting for lock2");

                synchronized (Main.lock2){
                    System.out.println("Thread 1: Lock1 and Lock2 both enabled");
                }
                System.out.println("Thread 1: Released lock2");
            }
            System.out.println("thread 1: Released lock1. Exiting");
        }
    }

}

