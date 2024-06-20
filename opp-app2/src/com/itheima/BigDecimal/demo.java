package com.itheima.BigDecimal;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.StringJoiner;

public class demo {
    public static void main(String[] args) throws Exception {
//        double a = 0.1;
//        double b = 0.2;
//        BigDecimal a1 = BigDecimal.valueOf(a);
//        BigDecimal b1 = BigDecimal.valueOf(b);
//
//        System.out.println(a1.add(b1));

        // Instant对标的是传统的Date
        // 而传统的Date只能精确到毫秒，且它是可变对象

//        Instant start = Instant.now(); // 不可变对象
//        Thread.sleep(5000);
//        Instant end = Instant.now(); // 不可变对象
//        System.out.println(end.getEpochSecond() - start.getEpochSecond());

//        Instant instant = Instant.now();
//        System.out.println(instant.getNano());
//
//        //
//        LocalDateTime ldt = LocalDateTime.now();
//        System.out.println(ldt.getNano());
//        // Instant还能获得毫秒数
//        long milli = instant.toEpochMilli();
//        System.out.println(milli);

        // 1.创建一个日期格式化器对象
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");

        // 2.待解析的日期时间对象localDate， localTime均可
        LocalDateTime start = LocalDateTime.now();
        LocalDateTime ldt = LocalDateTime.of(2019, 3, 4, 12, 18, 20);
        LocalDateTime end = start.plusMinutes(10);

        // 3.1 用format解析
        String rs = dtf.format(start);
        System.out.println(rs);

        // 3.2 另一种解析方式
        System.out.println(start.format(dtf));

        // 4.将字符串解析成localDateTime格式
        String dateStr = "2019年03月04日 12:18:20";
        LocalDateTime parse = LocalDateTime.parse(dateStr, dtf);
        System.out.println(parse);

        int[] arr = {10, 20, 30};
        Arrays.sort(arr);

    }
}
