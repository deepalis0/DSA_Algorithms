import java.util.Scanner;

public class Functions {

    public static void main(String[] args)
    {
        displayName("Rajendra");
        int res = add(12,2);
        System.out.println(res);
//      displayGreetings();
//      Scanner sc = new Scanner(System.in);
//      System.out.println("Enter your message: ");
//      String msg = sc.nextLine();
//      displayMsg(msg);
//
//      //Find area of square
//      System.out.println("Enter the side of square: ");
//      int side = sc.nextInt();//5
//      int area = areaOfSquare(side);//25
//      displayMsg("The area of square is "+ area);
//
//     //Find area of rectangle
//     System.out.println("Enter the length of rectangle: ");
//     int length = sc.nextInt();
//     System.out.println("Enter the breadth of rectangle: ");
//     int breadth = sc.nextInt();
//     area = areaOfRectangle(length,breadth);
  //   displayMsg("The area of rectangle is "+ area);

    }

    static void displayName(String name)
    {
        System.out.println(name);
    }
    static int add(int a,int b)
    {
        return a +b;
    }
    static void displayGreetings()
    {
        System.out.println("Welcome to Functions Lecture!!");
        //return;
    }
    static void displayMsg(String message)
    {
        System.out.println(message);

    }
    //void as returnType -- this function
    //is not returning any data

    static int areaOfSquare(int s)//function signature
    {
        return s*s;//returns the value to the caller
    }

    static int areaOfRectangle(int a,int b)
    {
        return a*b;
    }



}




