import java.util.Scanner;

public class Conditional {

    public  static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
//        int a = sc.nextInt();
//        System.out.println("Enter b");
//        int b = sc.nextInt();
//        if(a>b)
//        {
//            System.out.println("Inside if ");
//        }
//        else
//        {
//            System.out.println("Inside else");
//        }
//        System.out.println("END");

        System.out.println("Enter color code: ");
        int colorCode = sc.nextInt();
        String color;
        if(colorCode==1)
        {
            color = "RED";
        }
        else if(colorCode==2)
        {
            color = "BLUE";
        }
        else if(colorCode==3)
        {
            color ="PINK";
        }
        else
        {
            color = "UNKNOWN";
        }
        System.out.println("The value of color code: "+colorCode + " is: "+ color);
        ConstructorsExample constructorsExample = new ConstructorsExample();
        ConstructorsExample constructorsExample1 = new ConstructorsExample(12,"msg");


    }

}
