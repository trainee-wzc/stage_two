package com.itheima.d2_reflect;

import org.junit.Test;

import java.lang.reflect.Field;

public class TestField {
    @Test
    public void testGetFields() throws Exception {
        // 1.任何反射的第一步，都是先获得类的类对象
        Class c = Cat.class;
        // 2.获取类的全部成员变量
        Field[] fields = c.getDeclaredFields();
        // 3.遍历成员变量数组
        for (Field field : fields) {
            System.out.println(field.getName() + " " + field.getType());

        }
        Field fName = c.getDeclaredField("name");
        // 4.赋值
        Cat cat = new Cat();
        fName.set(cat,"加菲猫");
        fName.set(cat,5);

    }
}
