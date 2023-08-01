public class InterfaceDemo {

    public static void main(String[] args)
    {

        DataStructures stack = new Stack();

        DataStructures queue = new Queue();

        stack.add(12);
        stack.delete();

        queue.add(17);
        queue.delete();

        System.out.println(DataStructures.maxSize);

        stack.display();
        queue.display();



        Shape square = new Square();
        square.area(3,3);

        Shape rectangle = new Rectangle();
        rectangle.area(3,4);




    }
}
