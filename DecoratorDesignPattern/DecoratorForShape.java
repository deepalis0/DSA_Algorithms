package DecoratorDesignPattern;

public class DecoratorForShape {

    Shape shape;

    DecoratorForShape(Shape shape)
    {
        this.shape = shape;
    }

    public void display()
    {
        System.out.println("Inside decorator of shape");
    }

    void area()
    {
        int area = shape.getSide1() * shape.getSide2();
        System.out.println("Area of shape is : "+ area);
    }


}
