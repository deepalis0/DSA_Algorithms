import java.util.Scanner;

public class BitManipulation {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        displayInBinary(x);
       // System.out.println("x is even? "+ checkIfEven(x));
        System.out.println("Is nth bit set ? "+ checkIfNthBitSet(3,x));
        displayInBinary(setNthBit(0,x));
//        displayInBinary(unsetNthBit(0,x));
//        displayInBinary(toggleNthBit(0,x));
//        displayInBinary(turnOffRightMostBit(x));
//        displayInBinary(turnOnRightMostBit(x));
    }

    static void displayInBinary(int n)
    {
        System.out.println(Integer.toBinaryString(n));
    }

    static boolean checkIfEven(int n)
    {
       if((n&1)==0)
       {
           return true;
       }
       return false;
    }

    //158  10011110 3rd bit
    static boolean checkIfNthBitSet(int n,int x)
    {
        if( (x & (1<<n) ) > 0 )
        {
            return true;
        }
        return false;
    }

    static int setNthBit(int n,int x)
    {
        return  (x | (1<<n));
    }

    static int unsetNthBit(int n,int x)
    {
        return (x & ~(1<<n));
    }
    static int toggleNthBit(int n,int x)
    {
        return (x ^ (1<<n));
    }

    static int turnOffRightMostBit(int n)
    {
        return (n & (n-1));
    }

    static int turnOnRightMostBit(int n)
    {
         //return (n | 1); //this will make no changes if the right most bit is turned ON
        return (n | (n+1)); //this will even make changes in the number n .eg. n= 159
    }

}
