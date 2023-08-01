package DecoratorDesignPattern;

public class DecoratorForCircle implements IGeometricFigures{

    IGeometricFigures figure;

    DecoratorForCircle(IGeometricFigures figure)
    {
        this.figure = figure;
    }
    @Override
    public void display() {
        System.out.println("Inside the decorator for circle");
        this.figure.display();
    }
}
