package package2;
import package1.demo;

public class childInDifferntPackage extends demo{
    public static void main(String[] args)
    {
        demo d = new demo();
        d.publicDisplayMethod();
       //d.protectedDisplayMethod(); //in different package only child/subclass can access


        childInDifferntPackage obj = new childInDifferntPackage();
        obj.protectedDisplayMethod();
    }
}
