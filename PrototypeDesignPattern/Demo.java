package PrototypeDesignPattern;

public class Demo {
    public static void main(String[] args)
    {
        Prototype obj = new Prototype(12);
        obj.display();

        IProtoype cloneObject = obj.clone();
        cloneObject.display();

        obj.length = 34;
        obj.display();
        cloneObject.display();

        /*  Shape Square   */

        Square square = new Square(12,"red");
        square.display();

        Shape cloneSquare = square.clone();
        cloneSquare.display();

        square.color = "blue";

        square.display();
        cloneSquare.display();



    }
}
