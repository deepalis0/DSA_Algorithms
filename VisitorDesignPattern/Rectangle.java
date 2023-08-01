package VisitorDesignPattern;

public class Rectangle extends  Shape
{

    int length , breadth;
    @Override
    public void accept(Visitor v) {
        v.visitShape(this);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
}
