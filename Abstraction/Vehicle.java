package Abstraction;

public interface Vehicle {
        // all are the abstract methods.
        void changeGear(int a);
        void speedUp(int a);
        void applyBrakes(int a);

        int a = 12; //all variables in interface are by default final
        static void display()
        {
                System.out.println("Static method which can be called directly by Interface Name");
        }

        default void commonUtility()
        {
                System.out.println("Common Utility used by all implementation of Interface");
        }


}
