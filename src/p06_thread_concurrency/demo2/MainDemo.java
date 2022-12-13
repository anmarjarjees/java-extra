package p06_thread_concurrency.demo2;

public class MainDemo {
    public static void main(String[] args) {
        MultiThreadDemo myThread1 = new MultiThreadDemo();
        myThread1.start();
        /*
         * to demonstrate the idea of multi-threading,
         * we need to add more threads
         */
        MultiThreadDemo myThread2 = new MultiThreadDemo();
        myThread2.start();

        MultiThreadDemo myThread3 = new MultiThreadDemo();
        myThread3.start();

        /*
         * The three thread will run at the same time
         */

        /*
         * For testing, replace the start() with run() method
         * these three methods will run on sequence:
         * 
         * First:
         * myThread1.run() => will print the times table from * 1 to * 10
         * 
         * Then:
         * myThread2.run() => will print the times table from * 1 to * 10
         * 
         * Finally:
         * myThread3.run() => will print the times table from * 1 to * 10
         */
        myThread1.run();
        myThread2.run();
        myThread3.run();

        System.out.println("************* End First Trying *************");
        System.out.println("********************************************");

        /*
         * We can run multiple thread by placing our instantiating statement
         * and the start() method inside a loop :-)
         * 
         * Below are running 4 threads at the same time:
         */
        for (int i = 1; i <= 4; i++) {
            MultiThreadDemo manyThread = new MultiThreadDemo();
            manyThread.start();
        }
    } // main()
} // C1MultiThreadMain
