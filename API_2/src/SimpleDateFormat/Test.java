package SimpleDateFormat;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        System.out.println(d);
        long time = d.getTime();
        System.out.println(time);

        // 格式化日期对象和时间毫秒值
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE a");
        String time1 = sdf.format(d);
        String time0 = sdf.format(time);
        System.out.println(time0);
        System.out.println(time1);

        String dateStr = "2022-12-12 12:12:11";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d2 = sdf1.parse(dateStr);
        System.out.println(d2);


    }
}
