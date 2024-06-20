package AbstractClass;

public class Cat extends Animal {

    @Override
    public void scream() {
        System.out.println(getName()+"喵喵喵的叫~~~~");
    }
}
