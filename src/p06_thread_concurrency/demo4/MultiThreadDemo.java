package p06_thread_concurrency.demo4;

// 1. Extend the class "Thread"
public class MultiThreadDemo extends Thread {
    private int threadNumber;

    public MultiThreadDemo(int threadNumber) {
        this.threadNumber = threadNumber;
    }

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

    @Override
    public void run() {
        // the factorial of number 7:
        int number = 7;
        for (int i = 0; i <= 10; i++) {
            /*
             * making one the thread (threadNumber) throwing an exception
             */
            if (threadNumber == 2) {
                // throwing a runtime exception
                throw new RuntimeException();
            }
            System.out.println("Thread#" + threadNumber + ": " + number + " * " + i + " = " + number * i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}