package p06_thread_concurrency.demo5;

public class MainDemo {
    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++) {
            MultiThreadDemo currentThread = new MultiThreadDemo(i);
            /*
             * Notice that .start() method
             * belongs to "Thread" class
             * and we are not extending this class anymore
             * 
             * The solution:
             */
            Thread myThread = new Thread(currentThread);
            // instead of currentThread.start();
            myThread.start();
        }
    } // main()
} // C1MultiThreadMain
