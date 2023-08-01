package VisitorDesignPattern;

public class VisitorConcrete implements  Visitor{
    @Override
    public void visitShape(Shape shape)
    {
        System.out.println("Visiting shape");
    }

    @Override
    public void visitShape(Square shape) {

        System.out.println("Visiting Square, area : " + shape.getSide()*shape.getSide());
    }

    @Override
    public void visitShape(Rectangle shape) {
        System.out.println("Visiting Rectangle, area: "+ shape.getLength() * shape.getBreadth());
    }

    @Override
    public void visitShape(Circle shape) {
        System.out.println("Visiting Circle, area: "+ shape.getRadius()*3.14* shape.getRadius());
    }
}
