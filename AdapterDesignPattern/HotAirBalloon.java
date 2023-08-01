package AdapterDesignPattern;
//legacy code or the third party code which the client needs to use
public class HotAirBalloon
{
    String gasUsed = "Helium";
    void fly(String gasUsed)
    {
        System.out.println("Flying Hot Air Balloon");
    }

    String getGasUsed()
    {
        return gasUsed;
    }




}
