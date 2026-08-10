class Solution {
    public static long timerequired(int[] piles , int time )
    {
        long ans = 0;
        for(int i : piles)
        {
          ans += Math.ceil((double)i / time);
        }
        return ans;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high =  Arrays.stream(piles).max().getAsInt();
        while(low <= high)
        {
            int mid = (low+high )/2;
            long ans = timerequired(piles, mid);
            if( ans <= h)
            {
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}