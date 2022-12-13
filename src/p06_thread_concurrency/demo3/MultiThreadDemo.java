package p06_thread_concurrency.demo3;

// 1. Extend the class "Thread"
public class MultiThreadDemo extends Thread {
    /*
     * To know which thread (thread number) is running/executing
     * the current statement, we can use the class constructors
     * 
     * passing an int parameter that represents the thread number
     */
    private int threadNumber;

    public MultiThreadDemo(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        // the factorial of number 7:
        int number = 7;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread#" + threadNumber + ": " + number + " * " + i + " = " + number * i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}