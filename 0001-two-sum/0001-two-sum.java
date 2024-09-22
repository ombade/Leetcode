class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer , Integer >num = new HashMap<>();
        int n = nums.length;
        for(int i =0 ; i< n ; i++)
        {
            // build the hash map
            num.put(nums[i], i);
        }
        // find the complement
        for(int i =0 ; i< n ; i++)
        {
            int comp = target -nums[i];
            if(num.containsKey(comp) && num.get(comp) != i)
            {
                return new int[]{i , num.get(comp)};
            }

        }

        return new int[]{};
        
    }
}