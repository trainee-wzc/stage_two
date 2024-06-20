package d1_arrays;

import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student("蜘蛛精", 169.5, 23);
        students[1] = new Student("紫霞", 163.8, 26);
        students[2] = new Student("紫霞", 163.8, 26);
        students[3] = new Student("至尊宝", 167.5, 24);

        // 对象的排序方式一：匿名内部类
        // lambda表达式只能简化函数式接口的匿名内部类
//        Arrays.sort(students, new Comparator<Student>() {
//                @Override
//                public int compare(Student o1, Student o2) {
//                return (o1.getAge() - o2.getAge() >= 0 ? 1 : -1);
//            }
//        });
        Arrays.sort(students, (o1, o2) -> o1.getAge() - o2.getAge());

        System.out.println(Arrays.toString(students));

//        // 待爬取的内容
//        String data = "937041684@qq.com, 2991933729@qq.com, " +
//                "2956017437@qq.com";
//
//        // 1.定义正则表达式
//        String regex = "[1-9]\\d{8,12}";
//
//        // 2.把正则表达式封装成一个Pattern对象
//        Pattern pattern = Pattern.compile(regex);
//
//        // 3.把pattern对象转化成匹配内容的匹配器对象
//        Matcher matcher = pattern.matcher(data);
//
//        // 4.爬取内容 matcher.find() matcher.group()
//        while (matcher.find()) {
//            System.out.println(matcher.group());
//        }

        Map<String, Integer> map = new HashMap<>();

        map.put("zixia", 165);
        map.put("zichao", 185);
        map.put("zhizun", 175);
        map.put("zhizhu", 170);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + "\t\t==>" + entry.getValue());
        }



    }
}
