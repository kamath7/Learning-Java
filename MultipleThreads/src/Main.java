public class Main {
    public static void main(String[] args) {

        CountDown countDown = new CountDown();
//        CountDown countDown2 = new CountDown();

        CountDownThread t1 = new CountDownThread(countDown);
        t1.setName("Thread 1");
        CountDownThread t2 = new CountDownThread(countDown);
        t2.setName("Thread 2");
        t1.start();
        t2.start();
    }
}

class CountDown {
    //in the for loop the thread can be suspended during the for's operations. in the current case we have given a shared variable in the heap which all threads use.
    private int i;

    public synchronized void doACountdown() {
//synchronized here makes the thread 1 complete the countdown and then lets thread2 do it
        String color;
        switch (Thread.currentThread().getName()) {
            case "Thread 1":
                color = ThreadColor.ANSI_RED;
                break;
            case "Thread 2":
                color = ThreadColor.ANSI_GREEN;
                break;
            case "Thread 3":
                color = ThreadColor.ANSI_CYAN;
                break;
            default:
                color = ThreadColor.ANSI_PURPLE;
        }

        for (i = 10; i > 0; i--) {
            System.out.println(color + Thread.currentThread().getName() + ": " + i);
        }
    }
}

class CountDownThread extends Thread {
    private CountDown threadCountDown;

    public CountDownThread(CountDown countDown) {
        threadCountDown = countDown;
    }

    @Override
    public void run() {
        threadCountDown.doACountdown();
    }
}