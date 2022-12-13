package p06_thread_concurrency.demo1;
/*
  * By default, Java has one thread to be run at time
  * this default thread is the "main()" method.

  On of the ways to use thread is to extend the class "Thread"
  */

// 1. Extend the class "Thread"
public class MultiThreadDemo extends Thread {

    /*
     * NOTE:
     * Class "Thread" implement a functional interface
     * named "runnable" interface
     * 
     * This interface has one abstract method based on the
     * functional interfaces rules:
     * 
     * This method is called "run()"
     * public abstract void run();
     * 
     * the next step to make this class multi-threadable
     * is to override the Thread method "run()"
     * 
     * This function doesn't accept or return any value
     */
    @Override
    public void run() {
        // the factorial of number 7:
        int number = 7;
        int result = 1;
        String msg = number + "! ";
        for (int i = number; i >= 1; i--) {
            result = result * i;
            msg += number-- + " x ";
        }
        System.out.println(msg + " = " + result);
    }

}