import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();

        int[] a = new int[n];
        System.out.println("Enter values for the  array : ");
        for(int i = 0 ;i< n ;i ++)
        {
            System.out.println("Enter value: ");
            a[i] = sc.nextInt();
        }
        System.out.println("Displaying values for array: ");
        display(a);





    }

     static void display(int[] a)
    {
        for(int i = 0;i<a.length ;i++)
        {
            System.out.print(a[i]+ " ");
        }
        System.out.println();
    }
}
