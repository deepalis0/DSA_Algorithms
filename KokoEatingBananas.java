class KokoEatingBananas
{
    public int minEatingSpeed(int[] piles, int h) {

        int max = piles[0];
        for(int i=1;i<piles.length;i++)
        {
            max = Math.max(piles[i],max);
        }
        int high = max;
        int low = 1;
        int ans = Integer.MAX_VALUE;
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            if(isPossible(mid,piles,h))
            {
                ans = mid;
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return ans;

    }

    boolean isPossible(int key,int[] piles,int h)
    {
        int hourSpent = 0;
        for (int pile : piles) {
            hourSpent += Math.ceil((double) pile / key);
        }
        return hourSpent <= h;

    }
}