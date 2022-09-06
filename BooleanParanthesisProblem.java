import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class BooleanParanthesisProblem {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            t--;
            int m = sc.nextInt();
            int n = sc.nextInt();
            boolean[][] a = new boolean[m][n];
            //boolean[] isMarked = new boolean[m];
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    int x = sc.nextInt();
                    if(x==1)
                    {
                        //isMarked[i] = true;
                        a[i][0] = true;
                    }
                }
            }
              for(int i=0;i<m;i++)
              {
                  for(int j=0;j<n;j++)
                  {
                      if(a[i][0]) //isMarked[i]
                      {
                          System.out.print(1+" ");
                      }
                      else
                      {
                          System.out.print(0+" ");
                      }
                  }
                  System.out.println();
              }
        }
    }
}