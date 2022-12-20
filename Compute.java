import java.util.ArrayDeque;

public class Compute {

    public static long[] printFirstNegativeInteger(long a[], int n, int k)
    {

        ArrayDeque<Integer> dq = new ArrayDeque<>();
        int i=0,j=0;
        long[] res = new long[k];
        int r = 0;
        while(j<a.length)
        {
            if(a[j]<0)
            {
                dq.addLast(j);
            }
            if(j-i+1<k)
            {
                j++;
            }
            else
            {
                if(j-i+1==k)
                    res[r++] = dq.isEmpty()?0:a[dq.peekFirst()];
                if(!dq.isEmpty() && dq.peekFirst()==i)
                {
                    dq.removeFirst();
                }
                j++;
                i++;
            }
        }
        return res;
    }
    public static void main(String[] args)
    {
        long[] a = new long[]{-8 ,2 ,3 ,-6 ,10};
        long[] res =printFirstNegativeInteger(a,5,2);
    }
}
