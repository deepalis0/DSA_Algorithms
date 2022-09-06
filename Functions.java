import java.util.Scanner;

public class Functions {

    public static void main(String[] args)
    {
      displayGreetings();
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your message: ");
      String msg = sc.nextLine();
      displayMsg(msg);

      //Find area of square
      System.out.println("Enter the side of square: ");
      int side = sc.nextInt();
      int area = areaOfSquare(side);
      displayMsg("The area of square is "+ area);

     //Find area of rectangle
     System.out.println("Enter the length of rectangle: ");
     int length = sc.nextInt();
     System.out.println("Enter the breadth of rectangle: ");
     int breadth = sc.nextInt();
     area = areaOfRectangle(length,breadth);
     displayMsg("The area of rectangle is "+ area);
    }

    static void displayGreetings()
    {
        System.out.println("Welcome to Functions Lecture!!");
    }
    static void displayMsg(String message)
    {
        System.out.println(message);
    }

    static int areaOfSquare(int s)
    {
        return s*s;
    }

    static int areaOfRectangle(int a,int b)
    {
        return a*b;
    }
}
