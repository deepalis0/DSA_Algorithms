package Abstraction;

public class Cat extends Animal{
    @Override
    public void makeNoise() {
        System.out.println("Meow!!");
    }

    public void scratch()
    {
        System.out.println("Cat scratches!!");
    }
}
