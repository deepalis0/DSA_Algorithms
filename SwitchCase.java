import java.util.Scanner;

public class SwitchCase {
//https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html
    public static void main (String[] atdk)
    {
        Scanner sc = new Scanner(System.in);
        /*
         Syntax of switch block:  1 -1 0
         String name = ...;
            switch(name) {
              case :
                // code block
                break;
              case -1:
                // code block
                break;
              case 1:
                // code block
                break;
              default:
                // code block
            }
         */
         int day = 9; //char ,byte, short int, int, enum ,string
         switch (day) {  // if - else if --else
            case 1: // if( day == 1)
                System.out.println("Monday");
                break;
            case 2: //else if(day==2)
                System.out.println("Tuesday");
               break;
             case 3:
                 System.out.println("Wednesday");
                 break;
             case 4:
                 System.out.println("Thursday");
                 break;
             case 5:
                 System.out.println("Friday");
                 break;
             case 6:
                 System.out.println("Saturday");
                 break;
             case 7:
                 System.out.println("Sunday");
                 break;
             default : //else block if else if else
                 System.out.println("Invalid data entered");
                 break;

        }

          double d = 3.5;
         //below gives error!
//          switch(d)
//          {
//
//          }
        char x = 'a';
        switch(x)
        {
            case 'a':
                System.out.println("case 1");

        }
        String month = "March";
        switch(month)
        {
            case "Jan":
                System.out.println("Month is January");
                break;
            case "Feb":
                System.out.println("Month is February");
                break;
            default:
                System.out.println("Default case");
                break;

        }



        int a = 12; int b = 15;
        int larger = a>=b ? a : b;



        if(a>=b )
        {
            larger = a;
        }
        else {
            larger = b;
        }
        System.out.println(larger);

        //Calculator using Nested Switch
        System.out.println("-----------------Nested Switch!");
        System.out.println("enter month number");
        int m = sc.nextInt();
        System.out.println("enter year number");
        int year = sc.nextInt();//2024
        int noOfDays = 0;
        switch(m)
        {

            case 1:

            case 3:

            case 5:

            case 7:

            case 8:

            case 10:

            case 12:

                noOfDays =31;
                break;

            case 4:

            case 6:

            case 9:

            case 11:

                noOfDays =30;

                break;

            case 2:

                if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0) )

                    noOfDays = 29;

                else

                    noOfDays = 28;

                break;

            default:

                noOfDays = 0;

                break;
        }
        System.out.println("The number of days :"+ noOfDays);


    }


}


