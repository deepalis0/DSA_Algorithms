package AdapterDesignPattern;

public class Helicopter implements IAircraft{
    @Override
    public void fly() {
        System.out.println("Flying Helicopter!!");
    }
}
