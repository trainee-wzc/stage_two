package d3_exception;

import java.text.SimpleDateFormat;

// 运行时异常
public class ExceptionTest1 {
    public static void main(String[] args) {
        try {
            SaveAge1(150);
            System.out.println("没毛病啊，老铁！");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("byd,又写一堆bug？？");
        }

    }
    public static void SaveAge1(int age){
        if(age > 0 && age < 150){
            System.out.println("恭喜你年龄被成功保存  " + age);
        }else {
            throw new AgeIllegalRuntimeException("/ input age is illegal");
        }
    }


}
