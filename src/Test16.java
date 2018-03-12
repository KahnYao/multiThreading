import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test16 {

    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar c = Calendar.getInstance();

        //过去七天
        c.setTime(new Date());
        c.add(Calendar.DATE, -7);
        Date d = c.getTime();
        String day = format.format(d);
        System.out.println("过去七天：" + day);

        //过去一月
        c.setTime(new Date());
        c.add(Calendar.MONTH, -1);
        Date m = c.getTime();
        String mon = format.format(m);
        System.out.println("过去一个月：" + mon);

        //过去三个月
        c.setTime(new Date());
        c.add(Calendar.MONTH, -3);
        Date m3 = c.getTime();
        String mon3 = format.format(m3);
        System.out.println("过去三个月：" + mon3);

        //过去一年
        c.setTime(new Date());
        c.add(Calendar.YEAR, -1);
        Date y = c.getTime();
        String year = format.format(y);
        System.out.println("过去一年：" + year);


        //获取当前月最后一天
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        Calendar ca = Calendar.getInstance();
//        c.add(Calendar.YEAR, 1);
        ca.set(Calendar.DAY_OF_MONTH,1);//设置为1号,当前日期既为本月第一天
        String first = format1.format(ca.getTime());
        System.out.println("当前月份第一天：" + first);


        //获取当前月最后一天
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd 23:59:59");
//        Calendar ca = Calendar.getInstance();
        ca.set(Calendar.DAY_OF_MONTH, ca.getActualMaximum(Calendar.DAY_OF_MONTH));
        String last = format1.format(ca.getTime());
        System.out.println("当前月份最后一天：" + last);

    }

}
