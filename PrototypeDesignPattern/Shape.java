package PrototypeDesignPattern;

public abstract class Shape {

    String color;
    public abstract Shape clone();

    public abstract void display();

    Shape(String c)
    {
        this.color = c;
    }
    Shape()
    {

    }
    Shape(Shape obj)
    {
        this.color = obj.color;
    }


}
