package d3_exception;

import java.math.BigDecimal;
import java.util.Date;

public class ExceptionTest2 {
    public static void main(String[] args) {
        try {
            SaveAge(1123);
            System.out.println("没毛病老铁！");
        } catch (AgeIllegalException e) {
            e.printStackTrace();
            System.out.println("有bug啊!!!");
        }
    }

    // 抛出一个自定义的编译时异常需要在方法上使用 throws，不然运行时会有bug
    public static void SaveAge(int age) throws AgeIllegalException {
        if(age > 0 && age < 150){
            System.out.println("年龄保存成功: " + age);
        }else{
            // throw 抛出去这个异常对象
            // throws 用在方法上，抛出方法内部的异常
            throw new AgeIllegalException("/input age is illegal");
        }
    }

}
