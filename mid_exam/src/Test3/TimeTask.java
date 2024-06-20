package Test3;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.TimerTask;

public class TimeTask extends TimerTask {
    // 高考开始时间
    private LocalDateTime endTime;
    private LocalDateTime startTime;
    private Duration gap;

    // 构造器，对高考的开始时间进行初始化
    public TimeTask() {
        String end = "2023-06-07 09:00:00";
        String start = "2023-05-01 09:00:00";
        // 1.定义解析器
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        // 2.解析日期
        startTime = LocalDateTime.parse(start, dtf);
        endTime = LocalDateTime.parse(end, dtf);

        gap = Duration.between(startTime, endTime);


    }

    // 每一秒执行一次该方法
    @Override
    public void run() {
        // 补全代码：完成倒计时效果
        long days = gap.toDays();
        long hours = gap.toHours() % 24;
        long minus = gap.toMinutes() % 60;
        long seconds = gap.toSeconds() % 60;
        // 3.计算间隔
        System.out.println("距离高考还有" + days + "天" + hours + "时" + minus + "分" + seconds + "秒");

        // 4.自减操作
//        startTime = startTime.plusSeconds(1);
        gap = gap.minusSeconds(1);

    }

}
