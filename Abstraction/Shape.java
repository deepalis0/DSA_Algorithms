package Abstraction;

public abstract class Shape {
    String color;

    // these are abstract methods
    abstract double area();
    public abstract String toString();

    // abstract class can have the constructor
    public Shape(String color)
    {
        System.out.println("Shape constructor called");
        this.color = color;
    }
    public Shape()
    {
        System.out.println("Shape Default constructor called");
    }

    static void printParentClass()
    {
        System.out.println("Shape is the parent!");
    }


    // this is a concrete method
    public String getColor() {
        return color;
    }
}

 abstract class test
{


}
