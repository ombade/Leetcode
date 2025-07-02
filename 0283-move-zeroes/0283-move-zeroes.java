class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int cnt = 0;
        for(int i = 0; i< n ; i++)
        {
            if(nums[i] != 0) arr[cnt++] = nums[i];
        }
        for(;cnt < n ; cnt++)
        {
            arr[cnt] =0;
        }
        for( int k = 0 ;  k <n ;k++)
        {
            nums[k]= arr[k];
        }
    }
}