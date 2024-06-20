package com.itheima.d1_junit;

import org.junit.Assert;
import org.junit.Test;

public class StringUnitTest {
    @Test // 测试方法必须用@Test修饰，这是junit框架的规定
    public void testPrintNumber(){
        StringUtil.printNumber("admin");
        StringUtil.printNumber(null);
    }

    @Test // 测试方法
    public void testGetMaxIndex(){
        int index2 = StringUtil.getMaxIndex("admin");
        StringUtil.getMaxIndex(null);
        StringUtil.getMaxIndex("ysqd");

        // 有时候编译没有问题，但是方法内部可能出现了问题，这时候就要用到断言机制
        // 断言机制：程序员可以通过预测业务方法的结果
        Assert.assertEquals("bug!",4, index2);

    }


}
