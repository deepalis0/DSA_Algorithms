package VisitorDesignPattern;

public class Circle extends Shape
{

    int radius;
    @Override
    public void accept(Visitor v) {
        v.visitShape(this);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
