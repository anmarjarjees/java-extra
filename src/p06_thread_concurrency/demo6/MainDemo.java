package p06_thread_concurrency.demo6;

public class MainDemo {
    public static void main(String[] args) {
        /*
         * Implementing the Runnable interface
         * through an anonymous class
         * 
         * and we need to implement the "run()" method
         * with the quick fix :-) for simplicity and saving time
         */
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                int number = 7;
                for (int i = 0; i <= 10; i++) {
                    System.out.println(number + " * " + i + " = " + number * i);
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } // for

                int result = 1;
                String msg = number + "! ";
                for (int i = number; i >= 1; i--) {
                    result = result * i;
                    msg += number-- + " x ";
                }
                System.out.println(msg + " = " + result);
            } // run()
        }; // anonymous class

        /*
         * passing the object "runnable" of type "Runnable"
         * to the "thread" object
         */
        Thread thread = new Thread(runnable);
        thread.start();
    } // main()
} // class file
