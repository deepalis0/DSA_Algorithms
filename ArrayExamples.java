import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class ArrayExamples {

    public static void main(String[] args) throws IOException
    {

        // Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of array : ");
        int n =  Integer.parseInt(br.readLine()); //sc.nextInt();
        //  1<=n<=100

        int[] a = new int[n];
        System.out.println("Enter values for the  array : ");

        for(int i = 0 ;i< n ;i ++)//i: 0 1 2 3
        {
            System.out.println("Enter value: ");
            a[i] =  Integer.parseInt(br.readLine()); //sc.nextInt();
        }
        int min= Integer.MAX_VALUE; // a[0]
        int max= Integer.MIN_VALUE; // a[0]
        int sum = 0; //0+anyNo = anyNo
        int product = 1; //1 * anyNo = anyNO

        for(int i=0;i<n;i++)
        {
            max = Math.max(max,a[i]);

//            if(a[i]>max)
//            {
//                max = a[i];
//            }


            min = Math.min(min,a[i]);
//            if(a[i]<min)
//            {
//                min = a[i];
//            }
            sum += a[i]; // sum = sum + a[i]
            product  *= a[i]; //product = product * a[i]
        }
        System.out.println(max+ " "+ min);
        System.out.println(sum+ " "+ product);









    }
}
