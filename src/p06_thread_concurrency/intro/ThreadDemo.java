package p06_thread_concurrency.intro;

/* 
 * Thread in Java is like a virtual CPU
 */
public class ThreadDemo {
    /*
     * The main method is executed by thread
     */
    public static void main(String[] args) {
        /*
         * Creating a new thread object:
         */
        Thread myThread = new Thread();
        /*
         * The .start() method will trigger myThread
         * to start running at the same time with main thread
         */
        myThread.start();
        /*
         * If you run the application, you will not see anything
         * as the Thread "myThread" doesn't do anything,
         * it just starts and ends immediately
         */
    } // main()
} // end class
