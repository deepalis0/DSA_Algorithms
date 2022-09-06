package Abstraction;

public class InterfaceMain {
    public static void main (String[] args) {

        // creating instance of the bike.
        Bike bike = new Bike();
        bike.changeGear(1);
        bike.speedUp(4);
        bike.applyBrakes(3);
        bike.commonUtility();



        System.out.println("Bike present state :");
        bike.printStates();

        Vehicle vehicle = new Bike();
        System.out.println("Accessing the variables from interface: "+ Vehicle.a);  //bike.a
        //Accessing the default and static methods of Interface Vehicle:

        vehicle.commonUtility();
        //vehicle.display(); --ERROR
        Vehicle.display();

        bike.commonUtility();
        //bike.display(); --ERROR

    }
}


//https://www.geeksforgeeks.org/interfaces-in-java/