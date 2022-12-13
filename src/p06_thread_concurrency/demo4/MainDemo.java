package p06_thread_concurrency.demo4;

public class MainDemo {
    public static void main(String[] args) {
        /*
         * Important Note about multi-threading:
         * ************************************
         * if any thread throws an exception,
         * the rest will continue running
         * so the thread that has an error/exception
         * will no affect the other threads
         * 
         * To demonstrate the idea,
         * we will let one of the threads throws an exception
         */
        for (int i = 0; i <= 4; i++) {
            MultiThreadDemo manyThread = new MultiThreadDemo(i);
            manyThread.start();
        }

        /*
         * We can also add an exception to the main thread (for the main() method):
         * the other threads will continue to work...
         */
        throw new RuntimeException();
    } // main()
} // C1MultiThreadMain
