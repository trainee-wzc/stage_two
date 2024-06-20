package com.itheima.d2_reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;

public class TestConstructor {
    @Test
    public void testGetConstructors(){
        // 1.反射第一步：必须先得到这个类的class对象
        Class c1 = Cat.class;
        // 2.获得类的全部构造器
        Constructor[] constructors = c1.getConstructors();
        // 3.遍历数组中的每个构造器对象
        for (Constructor constructor : constructors) {

            System.out.println(constructor.getName() + "--->" +
                    constructor.getParameterCount());
        }
        
    }
    @Test
    public void testGetConstructor() throws Exception {
        Class c2 = Cat.class;
        // getConstructor只能获得public修饰的构造器
        Constructor constructor1 = c2.getConstructor();
        // getDeclaredConstructor()可以获得所有单个构造器，不管修饰符

        // 有参数构造器的获取方式，一定要带.class，这样才表示类型
        Constructor constructor2 = c2.getConstructor(String.class,int.class);

        // 开发中建议使用getDeclaredConstructor，这样就不会漏掉private修饰的构造器





    }

}
