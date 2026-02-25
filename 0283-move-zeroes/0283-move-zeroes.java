class Solution {
    public void moveZeroes(int[] nums) {
        int inspos = 0;
        for (int i = 0 ; i< nums.length ; i++)
        {
            if(nums[i] != 0)
            {
                int temp = nums[i];
                nums[i] = nums[inspos];
                nums[inspos] = temp;
              inspos++;
            }
              
        }
        // for(int i = inspos; i < nums.length ;i++)
        // {
        //     nums[i] = 0;
        // }
    }
}