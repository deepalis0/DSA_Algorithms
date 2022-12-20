package package2;
import package1.demo;
public class test {

    public static void main(String[] args)
    {
        demo d = new demo();
        d.publicDisplayMethod();
        //d.protectedDisplayMethod(); CANNOT access protected method from different package as class is not the subclass

    }

}
