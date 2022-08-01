public class SwitchCase {

    public static void main (String[] atdk)
    {
        /*
         Syntax of switch block:
            switch(expression) {
              case x:
                // code block
                break;
              case y:
                // code block
                break;
              default:
                // code block
            }
         */
         int day = 1;

         switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
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
             default :
                 System.out.println("Invalid data entered");
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

    }
}
