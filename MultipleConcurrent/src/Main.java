import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static final String EOF = "EOF";

    public static void main(String[] args) {

        List<String> buffer = new ArrayList<String>();
        ReentrantLock bufferLock = new ReentrantLock();
        MyProducer producer = new MyProducer(buffer, ThreadColor.ANSI_YELLOW, bufferLock);
        Consumer consumer = new Consumer(buffer, ThreadColor.ANSI_CYAN, bufferLock);
        Consumer consumer1 = new Consumer(buffer, ThreadColor.ANSI_WHITE, bufferLock);

        new Thread(producer).start();
        new Thread(consumer).start();
        new Thread(consumer1).start();
    }
}

class MyProducer implements Runnable {
    private List<String> buffer;
    private String color;

    private ReentrantLock bufferLock;

    public MyProducer(List<String> buffer, String color, ReentrantLock bufferLock) {
        this.buffer = buffer;
        this.color = color;
        this.bufferLock = bufferLock;
    }


    public void run() {
        Random random = new Random();
        String[] nums = {"69", "70", "71", "72", "73"};

        for (String num : nums) {
            try {
                System.out.println(color + "Adding " + num);
                bufferLock.lock();
                try {
                    buffer.add((num));
                } finally {
                    bufferLock.unlock();
                }
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(color + "EOF. Exiting");
        bufferLock.lock();
        try {
            buffer.add("EOF");

        } finally {
            bufferLock.unlock();
        }
    }
}

class Consumer implements Runnable {
    private List<String> buffer;
    private String color;

    private ReentrantLock bufferLock;

    public Consumer(List<String> buffer, String color, ReentrantLock bufferLock) {
        this.buffer = buffer;
        this.color = color;
        this.bufferLock = bufferLock;
    }

    public void run() {

        int counter = 0;
        while (true) {
            if (bufferLock.tryLock()) {
                try {
                    if (buffer.isEmpty()) {
                        continue;
                    }
                    System.out.println(color + " the counter -> "+counter);
                    if (buffer.get(0).equals("EOF")) {
                        System.out.println(color + "exiting");
                        break;
                    } else {
                        System.out.println(color + "Removed " + buffer.remove(0));
                    }
                } finally {
                    bufferLock.unlock();
                }
            }else{
                counter++;
            }

        }
    }

}