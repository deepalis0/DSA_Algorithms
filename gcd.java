public class gcd {
    //Time Complexity: O(log(min(a,b))|
    //Auxiliary Space: O(log(min(a,b))

    static int GcdR(int a, int b)
    {
        if (b == 0)
            return a;
        return GcdR(b, a % b);
    }

//    Time Complexity: O(log(min(a,b))|
//    Auxiliary Space: O(1)
    static int GcdI(int a, int b)
    {
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            }
            else {
                b = b % a;
            }
        }
        if (a == 0) {
            return b;
        }
        return a;
    }
}
