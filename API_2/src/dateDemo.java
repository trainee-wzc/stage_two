import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class dateDemo {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date start_time = sdf.parse("2023年11月11日 0:0:0");
        Date end_time = sdf.parse("2023年11月11日 0:10:0");
        long st = start_time.getTime();
        long et = end_time.getTime();

        String rs = "2023年11月11日 0:1:0";
        Date user_time = sdf.parse(rs);
        long it = user_time.getTime();
        if (it<st||it>et){
            System.out.println("很抱歉，您没有参加上秒杀活动!");
        }else {
            System.out.println("恭喜您，秒杀成功！");
        }


    }
}
