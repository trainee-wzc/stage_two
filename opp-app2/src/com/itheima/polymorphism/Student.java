package com.itheima.polymorphism;

public class Student extends People{
    private String name;

    @Override
    public void run() {
        System.out.println("student fast");
    }

    public void print(){
        System.out.println(name);
    }
}
