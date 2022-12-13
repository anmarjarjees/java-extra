package p06_thread_concurrency.demo1;

public class MainTest {
    public static void main(String[] args) {

        // boolean isChecked;

        MultiThreadDemo myThread = new MultiThreadDemo();
        /*
         * NOTE:
         * Yes, we can use our object "myThread"
         * to call/access the runnable interface "run()":
         * as shown below => myThread.run();
         * 
         * But this will not start a thread!
         * it will not run in a different/separate thread
         * 
         * Which means if any Error we might have, Java will say:
         * Exception in thread "main" java.lang.Error
         * 
         * Note: you can make simple error in your code for testing :-)
         * 
         * so we are still in the "main()" thread
         */
        // myThread.run();

        /*
         * Now the solution is use start() method to start a new thread
         * this method belongs to class "Thread"
         * 
         * When java reaches the .start() method,
         * it will branch off a brand new thread "Thread-0"
         * and start running the abstract method "run()"
         * 
         * You can see the error:
         * Exception in thread "Thread-0" java.lang.Error
         */
        myThread.start();
    } // main()
} // C1MultiThreadMain
