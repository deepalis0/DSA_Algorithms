package VisitorDesignPattern;

public class Shape implements Graphic{

    @Override
   public void accept(Visitor v)
   {
       System.out.println("In base class");
   }
}
