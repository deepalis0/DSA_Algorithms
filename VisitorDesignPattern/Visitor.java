package VisitorDesignPattern;

public interface Visitor {

    void visitShape(Shape shape);
    void visitShape(Square shape);
    void visitShape(Rectangle shape);
    void visitShape(Circle shape);
}
