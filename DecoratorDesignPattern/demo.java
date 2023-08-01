package DecoratorDesignPattern;

public class demo {
    public static void main(String[] args) {

        System.out.println("Call for the base operations:-------");
        DataSource simpleDataSource = new SimpleDataSource();
        simpleDataSource.readData("data");
        simpleDataSource.writeData("data");

        System.out.println("Call for the extended operations:-------");
        DataSource encryptDecorator = new EncryptDatSourceDecorator(simpleDataSource);
        encryptDecorator.readData("data");
        encryptDecorator.writeData("data");
        //encryptDecorator.newFeature(); this cannot be accessed

        //Using decorator pattern to extend functionality of a final class
        Shape shape = new Shape();
        shape.display();
        shape.setSide1(12);
        shape.setSide2(15);

        DecoratorForShape decorator = new DecoratorForShape(shape);
        decorator.area();


        IGeometricFigures circle = new Circle();
        circle.display();

        circle = new DecoratorForCircle(circle);
        circle.display();



    }
}
