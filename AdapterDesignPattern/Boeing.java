package AdapterDesignPattern;

public class Boeing implements IAircraft{
    @Override
    public void fly() {
        System.out.println("Flying Boeing!!");
    }
}
