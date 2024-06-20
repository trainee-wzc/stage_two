import java.util.Calendar;
import java.util.Date;

public class d5_Calendar {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        System.out.println(now);
        int days = now.get(Calendar.DAY_OF_YEAR);
        System.out.println(days);

        // 拿到日历中记录的日期对象
        Date d = now.getTime();
        System.out.println(d);

        now.add(Calendar.YEAR,-1);
        Date d2 = now.getTime();
        System.out.println(d2);


    }
}
