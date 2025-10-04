class Solution {
    // public long zeroFilledSubarray(int[] nums) {
    //     long count =0;
    //     int n = nums.length;
    //     for(int i =0 ; i< n ;i++)
    //     {
    //         for(int j = i ; j < n && nums[j]== 0; j++) 
    //         {
    //             count++;
    //             }
    //     }
    //     return count;
        
    // }
    public long zeroFilledSubarray(int[] nums)
    {
        int count =0;
        long result =0 ;
        int n = nums.length;
        for(int i =0 ; i< n ; i++)
        {
            if(nums[i]== 0)
            {
                count++;
            }
            else 
            {
                count = 0;
            }
            result =result +count;
        }
return result;
    }
}