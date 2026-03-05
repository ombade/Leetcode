class Solution {
    public int[] singleNumber(int[] nums) {
        // int[] ans = new int[];
        // Arrays.sort(nums);
        int xor =0;
        for(int i = 0 ; i< nums.length ; i++)
        {
            xor = xor ^ nums[i];

        }
        int mask = xor &(-xor);
        int groupA =0;
        int groupB =0;
        for(int i = 0 ; i< nums.length ; i++)
        {
            if ((mask & nums[i]) == 0)
            {
                groupA = groupA ^ nums[i];
            }
            else
            {
                  groupB = groupB ^ nums[i];
            }
        }
        return new int[] {groupA , groupB};
    }
}