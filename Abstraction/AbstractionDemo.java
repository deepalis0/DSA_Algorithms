package Abstraction;

public class AbstractionDemo {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.makeNoise();
        animal.testMethod();


        Cat obj = new Cat();
        obj.scratch();
        obj.makeNoise();

    }
}
