public class LinearSearch {
    public static void main(String args[]) {

        int[] a = new int[]{4,1,3,9,7};
        int target = 9;

        int index  = -1; // assuming the target is not present in the array. thus assigning -1 as index
        //Note: Index is never negative , thus -1

        //LinearSearch
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==target)
            {
                index = i;
                break;
            }
        }
        if(index==-1)
        {
            System.out.println("Target not found!");
        }
        else
        {
            System.out.println("Found target at index " + index);
        }

    }
}
