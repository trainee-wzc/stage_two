package com.itheima.d5_interface;

public class Test {
    public static void main(String[] args) {
        Student s = new A();
    }
}


class Student{

}

class A extends Student implements Driver,Singer{

    @Override
    public void drive() {

    }

    @Override
    public void sing() {

    }
}

interface Driver{
    void drive();
}

interface Singer{
    void sing();
}
