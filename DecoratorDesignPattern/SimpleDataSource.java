package DecoratorDesignPattern;

public class SimpleDataSource implements DataSource{

    int randomVariable;

    public int getRandomVariable() {
        return randomVariable;
    }

    public void setRandomVariable(int randomVariable) {
        this.randomVariable = randomVariable;
    }

    @Override
    public void readData(String data) {
        System.out.println("Reading simple data");
    }

    @Override
    public void writeData(String data) {
        System.out.println("Writing simple data");

    }
}
