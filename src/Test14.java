import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class PrintDemo14 {

    private final Lock queueLock = new ReentrantLock();

    public void print14() {
        queueLock.lock();
        try {
            Long duration = (long) (Math.random() * 10000);
            System.out.println(Thread.currentThread().getName()
                    + "  Time Taken " + (duration / 1000) + " seconds.");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
//            System.out.printf("%s printed the document successfully.\n", Thread.currentThread().getName());
            System.out.printf("%s printed the document successfully.\n", Thread.currentThread().getName());
            queueLock.unlock();
        }
    }
}

class ThreadDemo14 implements Runnable {

    PrintDemo14 printDemo14;

    /**
     * @param printDemo
     */
    ThreadDemo14(PrintDemo14 printDemo) {
        this.printDemo14 = printDemo;
    }

    @Override
    public void run() {
        System.out.printf("%s starts printing a document\n", Thread.currentThread().getName());
//        System.out.printf("%s starts printing a document\n", this.name);
        printDemo14.print14();
    }
}

public class Test14 {

    public static void main(String[] args) {
        PrintDemo14 PD = new PrintDemo14();

        ThreadDemo14 t1 = new ThreadDemo14(PD);
        ThreadDemo14 t2 = new ThreadDemo14(PD);
        ThreadDemo14 t3 = new ThreadDemo14(PD);
        ThreadDemo14 t4 = new ThreadDemo14(PD);

        new Thread(t1, "Thread - 1 ").start();
        new Thread(t2, "Thread - 2 ").start();
        new Thread(t3, "Thread - 3 ").start();
        new Thread(t4, "Thread - 4 ").start();
    }

}
