
public class SomeThread extends Thread {
    @Override
    public void run() {
        System.out.println(ThreadColor.ANSI_BLUE + currentThread().getName() + " calling!");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(ThreadColor.ANSI_BLUE+"Another one woke me ");
            return ;
//            e.printStackTrace();

        }
        System.out.println(ThreadColor.ANSI_BLUE+"Awoken from 3 second slumber ");
    }
}
