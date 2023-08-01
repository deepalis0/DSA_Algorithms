package PrototypeDesignPattern;

public class Prototype implements IProtoype{

    public int length;

    private Prototype(Prototype obj)
    {
         this.length = obj.length;
    }
    Prototype(int length)
    {
        this.length = length;
    }

    public IProtoype clone()
    {
        return new Prototype(this);

    }

    @Override
    public void display() {
        System.out.println(this.length);
    }
}
