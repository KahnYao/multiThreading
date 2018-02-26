class Thread15 implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "运行,  " + i);  //获取当前线程的名称
        }
    }
}

public class Test15 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Thread15 thread15 = new Thread15();    //定义Runnable子类对象
        new Thread(thread15, "第一个线程").start();  //手工设置线程的名称
        new Thread(thread15, "第二个线程").start();
    }
}
