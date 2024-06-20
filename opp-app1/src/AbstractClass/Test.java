package AbstractClass;

public class Test {
    public static void main(String[] args) {
        Animal a = new Cat();
        /*
        为什么这里父类能够调用子类的方法，
        原因就在于父类被定义为了抽象类，
        子类也override了抽象方法

        这种抽象类的写法可以说是更好的支持了多态！！
        */
        a.scream();
    }



}
