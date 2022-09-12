import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static final String EOF = "EOF";

    public static void main(String[] args) {

        ArrayBlockingQueue<String> buffer = new ArrayBlockingQueue<String>(6);
//        ReentrantLock bufferLock = new ReentrantLock();

        ExecutorService executorService = Executors.newFixedThreadPool(5); //producer, consumers * 2

        MyProducer producer = new MyProducer(buffer, ThreadColor.ANSI_YELLOW);
        Consumer consumer = new Consumer(buffer, ThreadColor.ANSI_CYAN);
        Consumer consumer1 = new Consumer(buffer, ThreadColor.ANSI_WHITE);

        executorService.execute(producer);
        executorService.execute(consumer);
        executorService.execute(consumer1);

        //need to manually shutdown threads
        Future<String> future = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println(ThreadColor.ANSI_YELLOW+ " Printed from callable class");
                return "Callable result";
            }
        });

        try{
            System.out.println(future.get());
        }catch (ExecutionException e){
            System.out.println("Something's wrong!");
        }catch(InterruptedException e){
            System.out.println("Thread interrupted!");
        }
        executorService.shutdown();

    }
}

class MyProducer implements Runnable {
    private ArrayBlockingQueue<String> buffer;
    private String color;


    public MyProducer(ArrayBlockingQueue<String> buffer, String color) {
        this.buffer = buffer;
        this.color = color;
    }


    public void run() {
        Random random = new Random();
        String[] nums = {"69", "70", "71", "72", "73"};

        for (String num : nums) {
            try {
                System.out.println(color + "Adding " + num);
                buffer.put(num);
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(color + "EOF. Exiting");
        try {
            buffer.put("EOF");

        } catch (InterruptedException e) {
            e.printStackTrace();
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