package AdapterDesignPattern;

public class Demo {
    public static void main(String[] args) {
        IAircraft helicopter = new Helicopter();
        helicopter.fly();

        HotAirBalloon hotAirBalloon = new HotAirBalloon();

        IAircraft hotBallon = new AdapterHotAirBalloon(hotAirBalloon);
        hotBallon.fly();
    }
}
