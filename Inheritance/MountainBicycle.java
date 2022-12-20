package Inheritance;

public class MountainBicycle extends Bicycle{
    public int seatHeight;

    // the MountainBike subclass has one constructor
    public MountainBicycle(int gear, int speed, int startHeight)
    {
        // invoking base-class(Bicycle) constructor
        super(gear, speed);
        seatHeight = startHeight;
    }

    public MountainBicycle()
    {

    }













    // the MountainBike subclass adds one more method
    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    }

    // overriding toString() method
    // of Bicycle to print more info
    @Override public String toString()
    {
        return (super.toString() + "\nseat height is "
                + seatHeight);
    }

    @Override
    public void applyBrake(int decrement) {
        System.out.println("apply Brake in child class ");
    }
}
