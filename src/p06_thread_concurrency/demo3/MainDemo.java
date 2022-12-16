package p06_thread_concurrency.demo3;

public class MainDemo {
    public static void main(String[] args) {
        /*
         * Running multiple thread by placing our instantiating statement
         * and the start() method inside a loop :-)
         * 
         * Below are running 4 threads at the same time:
         */
        for (int i = 0; i <= 4; i++) {
            MultiThreadDemo currentThread = new MultiThreadDemo(i);
            currentThread.start();
        }
        /*
         * You can see that the output shows the thread numbers
         * in random order as there is no order which thread runs
         * first they's are all running at the same time independently
         */
        System.out.println("********************************************");
    } // main()
} // C1MultiThreadMain
