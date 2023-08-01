package VisitorDesignPattern;

public class Demo {

    public static void main(String[] args) {
        Square square = new Square();
        square.setSide(12);

        Rectangle rectangle = new Rectangle();
        rectangle.setLength(4);
        rectangle.setBreadth(5);

        Circle circle = new Circle();
        circle.setRadius(3);

        Eclipse eclipse = new Eclipse();


        Demo d = new Demo();
        d.export(rectangle);
        d.export(square);
        d.export(circle);
        d.export(eclipse);

        /*
        When Shape is a parent class with a bunch of subclasses like Rectangle,Circle,Square
        then the call to  visitShape(shape) using the Visitor's Concrete class object leads to the call to the
        base class -Shape's  visitShape(Shape shape) even if the call is to one of its subclass.
        Reason - Compiler cannot assume that there will be a definitive
        visitShape(shape) method for all the subclasses. So it does early binding and
        prints the base class Shape's version of visitShape(shape)

        To avoid this, we do double dispatch. For which we add accept() method to an interface
        and make the base class implement it.Due to overriding, compiler is sure of the method existing and hence goes for
        dynamic binding. So we do have method overloading in Visitor but overriding the accept() method does the trick.
        Override the method accept() in all subclasses you need. Wherever you don't, there the base class
        Shape versions of accept() will be called. For example : class Eclipse has no accept() override
         */
    }

    void export(Shape shape)
    {
        Visitor visitor = new VisitorConcrete();
        //visitor.visitShape(shape);--> this leads to early binding i.e. compile time
        shape.accept(visitor);
    }



}
