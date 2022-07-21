
public class SomeThread extends Thread{
    @Override
    public void run() {
        System.out.println(ThreadColor.ANSI_BLUE+currentThread().getName()+" calling!");

    }
}
