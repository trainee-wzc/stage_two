package d4_bigDecimal;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        // 目标：掌握BigDecimal的使用，解决小数运算失真的问题
        double a = 0.1;
        double b = 0.2;
        double c = a + b ;
        System.out.println(c);

        // 推荐使用下列方式将小数转换为字符串
        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);
        BigDecimal c1 = a1.add(b1);
        System.out.println(c1);


        // 把BigDecimal对象转换为double类型的数据
        double k = c1.doubleValue();
        System.out.println(k);
    }
}
