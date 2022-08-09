import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static final String EOF = "EOF";
    public static void main(String[] args) {

     List<String> buffer = new ArrayList<String>();
     MyProducer producer = new MyProducer(buffer, ThreadColor.ANSI_YELLOW);
     Consumer consumer = new Consumer(buffer, ThreadColor.ANSI_CYAN);
     Consumer consumer1 = new Consumer(buffer, ThreadColor.ANSI_WHITE);

     new Thread(producer).start();
     new Thread(consumer).start();
     new Thread(consumer1).start();
    }
}

class MyProducer implements Runnable {
    private List<String> buffer;
    private String color;

    public MyProducer(List<String> buffer, String color) {
        this.buffer = buffer;
        this.color = color;
    }

    public void run() {
        Random random = new Random();
        String[] nums = {"69", "70", "71", "72", "73"};

        for (String num : nums) {
            try {
                System.out.println(color + "Adding " + num);
                buffer.add((num));
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(color + "EOF. Exiting");
        buffer.add("EOF");
    }
}

class Consumer implements Runnable{
    private List<String> buffer;
    private String color;

    public Consumer(List<String> buffer, String color) {
        this.buffer = buffer;
        this.color = color;
    }

    public void run(){
        while(true){
            if(buffer.isEmpty()){
                continue;
            }
            if(buffer.get(0).equals("EOF")){
                System.out.println(color + "exiting");
                break;
            }else{
                System.out.println(color + "Removed "+buffer.remove(0));
            }
        }
    }

}