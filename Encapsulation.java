public class Encapsulation {

    private int n;
    private String msg;

    public int getN()
    {
        return n;
    }

    public boolean setN(int x)
    {
        if(x>0 && x<100)
        {
            this.n = x;
            return true;
        }
        return false;
    }

    public String getMsg()
    {
        return  msg;
    }
    public void setMsg(String msg)
    {
        this.msg = msg;
    }

}
class EncapsulationDemo
{
    public static void main(String[] args)
    {
        Encapsulation encapsulation = new Encapsulation();
        encapsulation.setMsg("Hi, I am learning Encapsulation!!");
        System.out.println(encapsulation.getMsg());

        boolean gotSet = encapsulation.setN(112);
        if(gotSet)
          System.out.println(encapsulation.getN());
        else
            System.out.println("Unsuccessful updation of n!");
    }

}
