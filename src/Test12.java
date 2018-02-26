import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class PrintDemo12 {

    private final Lock queueLock = new ReentrantLock();

    public void print12() {
        queueLock.lock();
        try {
            Long duration = (long) (Math.random() * 10000);
            System.out.println(Thread.currentThread().getName()
                    + "  Time Taken " + (duration / 1000) + " seconds.");
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.printf("%s printed the document successfully.\n", Thread.currentThread().getName());
            queueLock.unlock();
        }
    }
}

class ThreadDemo12 extends Thread {
    PrintDemo12 printDemo12;

    /**
     * @param name
     * @param printDemo
     */
    ThreadDemo12(String name, PrintDemo12 printDemo) {
        super(name);
        this.printDemo12 = printDemo;
    }

    @Override
    public void run() {
        System.out.printf("%s starts printing a document\n", Thread.currentThread().getName());
        printDemo12.print12();
    }
}

public class Test12 {

    public static void main(String[] args) {
        PrintDemo12 PD = new PrintDemo12();

        ThreadDemo12 t1 = new ThreadDemo12("Thread - 1 ", PD);
        ThreadDemo12 t2 = new ThreadDemo12("Thread - 2 ", PD);
        ThreadDemo12 t3 = new ThreadDemo12("Thread - 3 ", PD);
        ThreadDemo12 t4 = new ThreadDemo12("Thread - 4 ", PD);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

}
