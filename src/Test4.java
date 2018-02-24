class Thread4 implements Runnable {

    private String name;

    public Thread4(String name) {
        this.name = name;// 给线程名字赋值
    }

    // 为了保持票数的一致，票数要静态
    static int tick = 20;

    // 创建一个静态钥匙
    static Object ob = "LOCK";//值是任意的

    @Override
    public void run() {
        while (tick > 0) {
            synchronized (ob) {
                // 这个很重要，必须使用一个锁，
                // 进去的人会把钥匙拿在手上，出来后才把钥匙拿让出来
                if (tick > 0) {
                    System.out.println(this.name + "卖出了第" + tick + "张票");
                    tick--;
                } else {
                    System.out.println("票卖完了");
                }
            }
            try {
                Thread.sleep( 1000);//休息一秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}

public class Test4 {

    /**
     * java多线程同步锁的使用
     * 示例：三个售票窗口同时出售10张票
     */
    public static void main(String[] args) {
        //实例化站台对象，并为每一个站台取名字
        //让每一个站台对象各自开始工作
        new Thread(new Thread4("窗口1")).start();
        new Thread(new Thread4("窗口2")).start();
        new Thread(new Thread4("窗口3")).start();
    }
}
