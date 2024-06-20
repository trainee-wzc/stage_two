package d7_method_references;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        String[] arr = {"boby","angela","Andy","dlei","caocao","Babo","jack","Cici"};

//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

        // 实现特定的功能 ，忽略大小写字母进行排序
//        Arrays.sort(arr, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareToIgnoreCase(o2);
//            }
//        });

        Arrays.sort(arr, (o1,o2) -> o1.compareToIgnoreCase(o2));

        //  使用lambda表达式对上式简化的结果：
        // 1.保留入参 2.删大括号 3.删分号 4.删return
        Arrays.sort(arr, (o1,o2) -> o1.compareToIgnoreCase(o2));
        System.out.println(Arrays.toString(arr));

        // 特定类型的方法引用
        // 对lambda表达式的进一步简化
        Arrays.sort(arr, String::compareToIgnoreCase);




    }
}
