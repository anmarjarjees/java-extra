package p06_thread_concurrency.demo5;

/* 
 * The second way to implement the multi-threading
 * is by implementing the "Runnable" interface
 * 
 * This interface has the method "run()"
 * that needs to be implemented
 * which is the same method of the "Thread" class
 * so no changes are needed
 */
// 1. Extend the class "Thread"
public class MultiThreadDemo implements Runnable {

    private int threadNumber;

    public MultiThreadDemo(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        // the factorial of number 7:
        int number = 7;
        for (int i = 0; i <= 10; i++) {
            System.out.println("Thread#" + threadNumber + ": " + number + " * " + i + " = " + number * i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}