import java.util.concurrent.atomic.AtomicInteger;

class Bank {
//    static int money = 1000;
    static AtomicInteger money = new AtomicInteger(1000);

    public static Object Lock = new Object();

    public void counter(int money) {
        synchronized (Lock) {
//            Bank.money -= money;
            Bank.money.addAndGet(-money);
            System.out.println("A取走了" + money + "还剩下" + (Bank.money));
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }

    public void ATM(int money) {
        synchronized (Lock) {
//            Bank.money -= money;
            Bank.money.addAndGet(-money);
            System.out.println("B取走了" + money + "还剩下" + (Bank.money));
        }
    }


}

class PersonA implements Runnable {

    Bank bank;

    public PersonA(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        while (Bank.money.get() >= 100) {
//        while (Bank.money >= 100) {
            bank.counter(100);// 每次取100块
            try {
                Thread.sleep( 100);//休息0.1秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

class PersonB implements Runnable {

    Bank bank;

    public PersonB(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        while (Bank.money.get() >= 200) {
//        while (Bank.money >= 200) {
            bank.ATM(200);// 每次取200块
            try {
                Thread.sleep( 100);//休息0.1秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

public class Test5 {
    public static void main(String[] args) {
        // 实力化一个银行对象
        Bank bank = new Bank();
        // 实例化两个人，传入同一个银行的对象
        new Thread(new PersonA(bank)).start();
        new Thread(new PersonB(bank)).start();
    }
}
