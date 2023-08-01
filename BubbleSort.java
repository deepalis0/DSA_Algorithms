public class BubbleSort {

    void sort(int[] a,int n)
    {
        boolean isSwapped = true;
        for(int i=0;i<n-1;i++)//n-1 passes
        {
            if(isSwapped==true)
            {
                isSwapped = false;
                for (int j = 0; j < n - 1 - i; j++) {
                    if (a[j] > a[j + 1]) {
                        //swap
                        isSwapped = true;
                        int temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    }
                }
            }
        }
    }
    public static void main(String[] args)
    {
        int[] a = new int[]{12,11,13,5,6};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(a,a.length);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }

}
