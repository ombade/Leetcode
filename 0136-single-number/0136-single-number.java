class Solution {
    public int singleNumber(int[] nums) {
        // int n = nums.length;
        int res = 0;
      for(int n : nums )
      {
        res = res ^ n;
      }
      return res;
    }
        // for(int i =0 ;i< n ; i++)
        // {
        //       boolean sing = true;
        //     for(int j =0;j<n ;j++)
        //     {
        //         if(i != j && nums[i]== nums[j])
        //         {
        //             sing = false;
        //             break;
        //         }
        //     }
        //     if(sing)
        //     {
        //         return nums[i];
        //     }
        // }
        // return -1;
    // }
}