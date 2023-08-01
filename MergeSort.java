public class MergeSort
{

    int[] sort(int[] a, int start, int end)
    {
        if(start < end)
        {
            int mid = start + (end-start)/2;//(start+end)/2;
            sort(a,start, mid);
            sort(a,mid+1,end);
            //start mid     mid+1 end
            merge(a,start,mid,end);//combine
        }
        return a;
    }
    void merge(int[] a,int start,int mid,int end)
    {
        int n1 = mid - start + 1;
        int n2 = end - mid;
        int[] L  = new int[n1];
        int[] R  = new int[n2];
        for(int i=0;i<n1;i++)
        {
            L[i] = a[start + i];
        }
        for(int i=0;i<n2;i++)
        {
            R[i] = a[mid + 1 + i];
        }
        int i=0,j=0,k=start;
        while(i<n1 && j<n2)
        {
            if(L[i] <= R[j])
            {
                a[k] = L[i];
                i++;
            }
            else {
                a[k] = R[j];
                j++;
            }
            k++;
        }
        while(i<n1)
        {
            a[k] = L[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            a[k] = R[j];
            j++;
            k++;
        }

    }
    public static void main(String[] args)
    {
        int[] a = new int[]{12,11,13,5,6};
        MergeSort mergeSort = new MergeSort();
        a = mergeSort.sort(a,0,a.length-1);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }


}
