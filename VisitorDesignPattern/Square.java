package VisitorDesignPattern;

public class Square extends Shape
{

    int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public void accept(Visitor v) {
        v.visitShape(this);
    }
}
