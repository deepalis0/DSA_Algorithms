public class BinarySearch {
    public static void main(String args[]) {

        int[] a = new int[]{4,1,3,9,7}; //{10, 80, 30, 90, 40, 50, 70}; // {10,9,8};
        int target = 3;
        int index = binarySearch(a,0,a.length-1,target);    //iterativeBinarySearch(a,0,a.length-1,target);

        System.out.println("The index of "+target+" is :" + index);


    }
    static int binarySearch(int[] a,int low,int high,int target)
    {
        if(low<high)
        {
           int mid = low + (high-low)/2;
           if(target==a[mid])
           {
               return mid;
           }
           if(a[mid]>target)
           {
               return binarySearch(a,low,mid-1,target);
           }
           return binarySearch(a,mid+1,high,target);
        }
        return -1;
    }

    static int iterativeBinarySearch(int[] a,int low,int high,int target)
    {
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            if(target==a[mid])
                return mid;
            else if(target<a[mid])
            {
                high--;
            }
            else
            {
                low++;
            }
        }
        return -1;
    }

}
