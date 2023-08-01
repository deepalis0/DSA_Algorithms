package Abstraction;

import Inheritance.Bicycle;

public class Main {
    public static void main(String[] args)
    {
        Shape s1 = new Circle("Red", 2.2);
        Shape s2 = new Rectangle("Yellow", 2, 4);

        System.out.println(s1.toString());
        System.out.println(s2.toString());

        System.out.println("+++++++++++++++++++++++++++++++++Object created directly of subclass: ++++++++++++++");
        Circle c = new Circle("Blue",2.0);
        System.out.println(c.toString());

        Shape.printParentClass();
        Circle.printParentClass();
        Rectangle.printParentClass();



    }
}
class Circle extends Shape {
    double radius;

    public Circle(String color, double radius)
    {

        // calling Shape constructor
        super(color);
        System.out.println("Circle constructor called");
        this.radius = radius;
    }


    @Override double area()
    {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override public String toString()
    {
        return "Circle color is " + super.getColor()
                + " and area is : " + area();
    }
}
 class Rectangle extends Shape {

    double length;
    double width;

    public Rectangle(String color, double length,
                     double width)
    {
        // calling Shape constructor
        super(color);

        System.out.println("Rectangle constructor called");
        this.length = length;
        this.width = width;
    }

    @Override double area() {
        return length * width;
    }

    @Override public String toString()
    {
        return "Rectangle color is " + super.getColor()
                + " and area is : " + area();
    }
}
class simpleClass{}
/*
Encapsulation vs Data Abstraction

Encapsulation is data hiding(information hiding) while Abstraction is detailed hiding(implementation hiding).
While encapsulation groups together data and methods that act upon the data, data abstraction deal with exposing the interface to the user and hiding the
details of implementation.
Encapsulated classes are java classes that follow data hiding and abstraction while We can implement abstraction by using abstract classes and interfaces.
Encapsulation is a procedure that takes place at the implementation level, while abstraction is a design-level process.
 */
/*
Encapsulation is a fundamental concept in object-oriented programming that refers to the practice of bundling data and the
methods that operate on that data within a single unit, known as a class. The purpose of encapsulation is to hide the implementation details of an object from the outside world and to provide a well-defined interface for interacting with that object.

Encapsulation is achieved by defining private instance variables within a class,
which can only be accessed or modified through public methods known as accessors and mutators
. Accessors are methods that allow outside code to read the value of a private variable, while mutators allow outside code to
modify the value of a private variable. By using accessors and mutators, the internal state of an object can be controlled and
protected from unwanted modification.

The benefits of encapsulation include increased data security, code reusability, and maintainability.
 It allows developers to easily modify the implementation of a class without affecting the rest of the codebase, and it helps prevent bugs and other issues caused by
 unintended modification of an object's internal state.

Overall, encapsulation is a powerful tool that enables developers to build robust and secure software systems, by separating the interface of a class from its implementation.
 */
