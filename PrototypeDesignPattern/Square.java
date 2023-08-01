package PrototypeDesignPattern;

public class Square extends Shape{
    int length;

    public Square(int length,String c)
    {
        super(c);
        this.length = length;
    }


   public Square(Square obj)
   {
       super(obj);
       this.length = obj.length;
   }


    @Override
    public Shape clone() {
        return new Square(this);
    }

    public void display()
    {
        System.out.println(this.color + " " +  this.length);
    }


}
