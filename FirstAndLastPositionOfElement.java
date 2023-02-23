//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FirstAndLastPositionOfElement {
    int resF;int resL;
    public int[] searchRange(int[] nums, int target) {

        resF = resL = -1;
        int[] res = new int[2];
        res[0] = fBS(nums,target,0,nums.length-1);
        res[1] = lBS(nums,target,0,nums.length-1);
        return res;
    }
    int fBS(int[] nums,int target,int low,int high)
    {
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            if(nums[mid]==target)
            {
                resF = mid;
                high = mid - 1;
            }
            else if(nums[mid]>target)
            {
                high = mid -1;
            }
            else
            {
                low = mid + 1;
            }


        }
        return resF;


    }
    int lBS(int[] nums,int target,int low,int high)
    {
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            if(nums[mid]==target)
            {
                resL = mid;
                low = mid + 1;
            }
            else if(nums[mid]>target)
            {
                high = mid -1;
            }
            else
            {
                low = mid + 1;
            }

        }
        return resL;

    }
}