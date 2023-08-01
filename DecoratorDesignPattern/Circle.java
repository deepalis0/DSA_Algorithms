package DecoratorDesignPattern;

public final class Circle implements  IGeometricFigures{
    @Override
    public void display() {
        System.out.println("Inside the base circle class!");
    }
}
