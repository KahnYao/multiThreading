class BOC {
    static int money = 1000;

    public static Object Lock = new Object();

    public void counter(int money) {
        synchronized (Lock) {
            BOC.money -= money;
            System.out.println("A取走了" + money + "还剩下" + (BOC.money));
        }
    }

    public void ATM(int money) {
        synchronized (Lock) {
            BOC.money -= money;
            System.out.println("B取走了" + money + "还剩下" + (BOC.money));
        }
    }
}


class PersonC implements Runnable {

    BOC boc;

    public PersonC(BOC boc) {
        this.boc = boc;
    }

    @Override
    public void run() {
        while (BOC.money >= 100) {
            boc.counter(100);// 每次取100块
            try {
                Thread.sleep( 100);//休息0.1秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

class PersonD implements Runnable {

    BOC boc;

    public PersonD(BOC boc) {
        this.boc = boc;
    }

    @Override
    public void run() {
        while (BOC.money >= 200) {
            boc.ATM(200);// 每次取200块
            try {
                Thread.sleep( 100);//休息0.1秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

public class Test13 {
    public static void main(String[] args) {
        // 实力化一个银行对象
        BOC boc = new BOC();
        // 实例化两个人，传入同一个银行的对象
        new Thread(new PersonC(boc)).start();
        new Thread(new PersonD(boc)).start();
    }
}
