package DecoratorDesignPattern;

public class EncryptDatSourceDecorator extends  DataSourceDecorator{

    DataSource source;

    EncryptDatSourceDecorator(DataSource source)
    {
        this.source = source;
    }

    @Override
    public void readData(String data) {
        System.out.println("Decrypting and then reading");
        this.source.readData(data);


    }

    @Override
    public void writeData(String data) {
        System.out.println("Encrypting and then writing");
        this.source.writeData(data);
    }

    public void newFeature()
    {
        System.out.println("New Feature!!");
    }

}
