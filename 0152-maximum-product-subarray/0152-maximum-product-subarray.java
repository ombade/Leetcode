class Solution {
    public int maxProduct(int[] nums) {
      int res = nums[0];
      int curMin  = 1;
      int  curMax =1;
      for(int i : nums)
      {
        if( i == 0)
        {
            curMin = 1 ;
            curMax = 1;
        }
        int temp = curMax * i;
        int maxi = Integer.max(temp ,i );
        curMax = Integer.max(maxi , i* curMin);
        int mini = Integer.min(temp , i);
        curMin = Integer.min(mini , i* curMin);

        res= Integer.max(res , curMax);
      }
        return res;
    }
}