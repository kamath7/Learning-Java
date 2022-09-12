public class Main {

    private static Object lock = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(new Worker(ThreadColor.ANSI_CYAN), "Priority 10");

    }

    private static class Worker implements  Runnable {
        private int runCount = 1;
        private String threadColor;

        public Worker(String threadColor) {
            this.threadColor = threadColor;
        }

        @Override
        public void run() {
            for (int i = 0; i < 100 ; i++){
                synchronized (lock){
                    System.out.format(threadColor + " %s: runCount = %d", Thread.currentThread().getName(), runCount++);

                }
            }
        }
    }
}