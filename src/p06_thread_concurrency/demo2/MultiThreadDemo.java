package p06_thread_concurrency.demo2;

// 1. Extend the class "Thread"
public class MultiThreadDemo extends Thread {

    @Override
    public void run() {
        // the factorial of number 7:
        int number = 7;
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
            /*
             * for a clear and more interesting demo,
             * we can add delay after each statement
             * to clearly see the sequence of printing the times table :-)
             * 
             * Using the sleep() static method of the "Thread" class
             * Notice that based on the method definition,
             * it throws an exception => "InterruptedException"
             * public static native void sleep(long millis) throws InterruptedException;
             * it has a "Checked Exception" that needs
             * to be solved through the compilation time by
             * - either with try/catch
             * - or with the throws statement
             * 
             * For more review check the package "p01_exception"
             */
            try {
                /*
                 * passing the number in 500ms to have a half second delay
                 * 1 second = 1000 ms
                 */
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}