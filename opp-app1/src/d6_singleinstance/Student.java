package d6_singleinstance;

import javax.xml.transform.Source;

public class Student {
    private int age;

    public Student() {
    }

    public Student(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void print(){
        System.out.println(age);
    }
}
