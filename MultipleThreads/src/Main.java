public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }
}

class CountDown{
    public void doACountdown(){
        String color;
        switch(Thread.currentThread().getName()){
            case "Thread 1":
                color = ThreadColor.ANSI_RED;
            case "Thread 2":
                color = ThreadColor.ANSI_BLACK;
            case "Thread 3":
                color = ThreadColor.ANSI_CYAN;
            default:color = ThreadColor.ANSI_PURPLE;
        }

        for (int i = 10 ; i > 0 ; i--){
            System.out.println(color+ Thread.currentThread().getName() + ": "+i);
        }
    }
}

class CountDownThread extends Thread {
    private CountDown threadCountDown;

    public CountDownThread(CountDown countDown){
        threadCountDown = countDown;
    }

    @Override
    public void run() {
        threadCountDown.doACountdown();
    }
}