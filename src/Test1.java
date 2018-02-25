import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Test1 {

    public static void main(String[] args) {

//        Integer.toBinaryString(int i) 转二进制
//        Integer.toHexString(int i)转十六进制
//        Integer.toOctalString(int i)转八进制


        System.out.println("Hello test1!");

        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.toHexString(11));
        System.out.println(Integer.toOctalString(8));

        System.out.println((int) (Math.random() * 1000));


        System.out.println(new Random().nextInt(1000));


        Random random = new Random();
        System.out.println(random.nextInt());
        System.out.println(random.nextInt(100));

        System.out.println(Math.abs(-100));

        System.out.println(Math.min(7,-4));

        System.out.println("===================================");

        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis() / 1000);


        System.out.println("===================================");

        Date date = new Date();

        System.out.println(date.getTime());
        Timestamp timestamp = new Timestamp(date.getTime());

        System.out.println(timestamp);


//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        String dateString = simpleDateFormat.format(date);
        System.out.println(dateString);

        System.out.println("===================================");

        int a = 10;  int b = 20;
        System.out.println(a == b ? true : false);

    }

}
