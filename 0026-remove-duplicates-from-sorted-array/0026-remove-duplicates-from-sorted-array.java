class Solution {
    // https://github.com/AlgoMaster-io/leetcode-solutions/blob/main/java/remove-duplicates-from-sorted-array.md
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int n = nums.length;
        for(int j = 1; j < n ; j++)
        {
            if (nums[i] != nums[j])
            {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}