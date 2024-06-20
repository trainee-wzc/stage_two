package com.itheima.demo;

public class Student {
    static int count;
    private String name;
    private double score;

    public Student() {
    }

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
        count++;
    }

    public void passTest(double score) {
        if (this.score > score) {
            System.out.println("恭喜您通过考试");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
