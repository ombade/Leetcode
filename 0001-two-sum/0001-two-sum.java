class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int n = nums.length;
        // for(int i =0 ; i< n ;i++)
        // {
        //     for(int j =i+1 ; j <n ;j++)
        //     {
        //         if(nums[i]+nums[j] == target)return new int[] {i,j};
        //     }
        // }
        // return new int[] {};
        Map<Integer , Integer>mp =new  HashMap<>();
        for(int i = 0 ; i< nums.length ; i++)
        {
            int val = target - nums[i];
            if(mp.containsKey(val))return new int[] {mp.get(val), i};
            mp.put(nums[i], i);
        }
        return new int[]{};
    }
}