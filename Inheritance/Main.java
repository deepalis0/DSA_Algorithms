package Inheritance;

public class Main {
    public static void main(String args[])
    {









        Bicycle bicycle = new Bicycle(4,50);
        bicycle.toString();
        //bicycle.setHeight(12); not accessible


        MountainBicycle mb = new MountainBicycle(3, 100, 25);
        mb.setHeight(15);
        System.out.println(mb.toString());


        System.out.println("Calling applyBrake ");
        bicycle.applyBrake(10);
        mb.applyBrake(1);


        Bicycle b = new MountainBicycle(3,100,25);
        b.applyBrake(2);


        mb.setHeight(13);
        //b.setHeight(12); //ERROR as the Reference of Base class cannot call the child class e

    }
}
