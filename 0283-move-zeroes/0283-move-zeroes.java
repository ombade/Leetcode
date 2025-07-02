class Solution {
    // public void moveZeroes(int[] nums) {
    //     int n = nums.length;
    //     int[] arr = new int[n];
    //     int cnt = 0;
    //     for(int i = 0; i< n ; i++)
    //     {
    //         if(nums[i] != 0) arr[cnt++] = nums[i];
    //     }
    //     for(;cnt < n ; cnt++)
    //     {
    //         arr[cnt] =0;
    //     }
    //     for( int k = 0 ;  k <n ;k++)
    //     {
    //         nums[k]= arr[k];
    //     }
    // }
    public void moveZeroes(int[] nums)
    {
        int last = 0;
        int n = nums.length;
         for(int i =0 ; i<n ; i++)
         {
            if(nums[i] != 0)
                
              {  int temp = nums[i];
                nums[i] = nums[last];
                nums[last] = temp;
                last++;}
         }
    }
}