package Test2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        // 定义一个List集合存储用户数据
        List<User> users = new ArrayList<>();

        // 业务一
        String userStrs = "10001:张三:男:1990-01-01#10002:李四:女:1989-01-09#10003:王五:男:1999-09-09" +
                "#10004:刘备:男:1899-01-01#10005:孙悟空:男:1900-01-01#10006:张三:女:1999-01-01#10007:刘备:女:1999-01-01" +
                "#10008:张三:女:2003-07-01#10009:猪八戒:男:1900-01-01";

        // 1.定义regex
        String regex = "\\d{5}:\\W{2,3}:\\W{1}:\\d{4}-\\d{2}-\\d{2}";

        // 2.获取pattern对象
        Pattern p = Pattern.compile(regex);

        // 3.交给容器对象
        Matcher matcher = p.matcher(userStrs);

        // 4.打印输出内容
        while (matcher.find()){
//            System.out.println(matcher.group());
            String rs = matcher.group();
            String[] userData = rs.split(":");
            // 拆分截取到的字符串信息

            // dtf
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            users.add(new User(Long.valueOf(userData[0]), userData[1], userData[2],
                    LocalDate.parse(userData[3], dtf)));
        }

        // 业务二

        // 定义一个map来存储用户名及出现的次数
        Map<String, Integer> userMap = new HashMap<>();

        // 遍历所有用户
        for (User user : users) {
//            System.out.println(user);
            String name = user.getUserName();
            // 名字在map集合中
            userMap.computeIfPresent(name, (k, v) -> ++v);
            // 若该名字不在map中
            userMap.computeIfAbsent(name, key -> 1);
        }
        // 遍历map集合
        userMap.forEach((k, v) -> System.out.println(k + ":" + v + "次"));

    }
}
