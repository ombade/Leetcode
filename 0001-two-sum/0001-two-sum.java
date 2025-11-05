class Solution {
    public int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        Map<Integer , Integer> mp = new HashMap<>();
        for(int i =0 ; i< size ; i++)
        {
            int remaning = target - nums[i];
            if(mp.containsKey(remaning))
            {
                return new int[] {i, mp.get(remaning)};
            }
            mp.put(nums[i], i);
        }
        return new int [] {};
    }
}