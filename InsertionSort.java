public class InsertionSort {

    void sort(int[] a ,int n)
    {
        for(int i=1;i<n;i++)//unsorted sub-array starts from index 1
        {
            int key = a[i];//the element in your unsorted part which you want to place in correct position in sorted part
            int j = i-1;
            while(j>=0 && a[j]>key)
            {
                a[j+1] = a[j];//shifting, to make space for the key element in sorted part
                j--;
            }
            a[j+1] = key;

        }
    }

    public static void main(String[] args)
    {
        int[] a = new int[]{12,11,13,5,6};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(a,a.length);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
