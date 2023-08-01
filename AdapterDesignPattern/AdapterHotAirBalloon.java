package AdapterDesignPattern;

// make the legacy code compatible with the client code by implementing the client component
// interface and then making necessary changes to adapt the client code and make it use the
//3rd party functionality
public class AdapterHotAirBalloon implements IAircraft{

    HotAirBalloon hotAirBalloon;
    AdapterHotAirBalloon(HotAirBalloon hotAirBalloon)
    {
        this.hotAirBalloon = hotAirBalloon;
    }

    @Override
    public void fly() {
        hotAirBalloon.fly(hotAirBalloon.getGasUsed());
    }
}
