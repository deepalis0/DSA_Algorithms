public interface DataStructures
{

    int maxSize = 100;

    void add(int data);

    int delete();

    default void display()
    {
        System.out.println("Welcome to DataStructure Interface!");
    }


}
