import java.util.Arrays;
public class BinarySearch {
    public static void main(String args[]) {

        int[] a = new int[]{4,1,3,9,7}; //{10, 80, 30, 90, 40, 50, 70}; // {10,9,8};
        //1 3 4 7 9
        Arrays.sort(a);
        int target = 3;
        int index = binarySearch(a,0,a.length-1,target);    //iterativeBinarySearch(a,0,a.length-1,target);

        System.out.println("The index of "+target+" is :" + index);

        int ele = 8;
        index = searchInsert(a,ele);
        System.out.println("8 can be inserted at index " + index);

        //(-(insertion point) – 1)
        index = Arrays.binarySearch(a,ele); // -(4)-1 = -5
        index = -(index+1);
        System.out.println("8 can be inserted at index " + index );

    }


        public static int searchInsert(int[] a, int target) {

            int low = 0,high = a.length - 1;
            while(low<=high)
            {
                int mid = low + (high - low)/2;
                if (a[mid]==target)
                    return mid;
                else if (a[mid] > target)
                    high = mid - 1;
                else
                    low = mid + 1;
            }
            return low;
        }



    static int binarySearch(int[] a,int low,int high,int target)
    {
        if(low<=high)
        {
           int mid = low + (high-low)/2;// (high+low)/2
           if(target==a[mid])
           {
               return mid;
           }
           // 1 3 5 19 30 45    target =3
            //a[mid] = 19 mid=3
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
            int mid = low + (high-low)/2;// (low+high)/2
            if(target==a[mid])
                return mid;
            else if(target<a[mid])
            {
                high = mid - 1;
            }
            else
            {
                low = mid+1;
            }
        }
        return -1;
    }

}
