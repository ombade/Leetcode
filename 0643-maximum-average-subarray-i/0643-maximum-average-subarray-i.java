class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int maxsum = -9999;
       int currentsum = 0;
       int left = 0;
       int window = 0;
    //    int ans = -9999;
       for (int i = 0; i < k ; i++)
       {
        window += nums[i];
       }
      double ans = (double)window/k;
       for(int right = k ; right < nums.length ; right++)
       {
        window  = window +  nums[right] - nums[right-k];
ans = Math.max((double)window/k , ans);
       }
       return ans;

    }
}