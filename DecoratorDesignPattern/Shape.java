package DecoratorDesignPattern;

public final class Shape {

    int side1 ,side2;

    public void display()
    {
        System.out.println("I am Shape");
    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }
}
