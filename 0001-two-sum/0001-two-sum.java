class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Brute force approch 
        // int n = nums.length;
        // for(int i = 0; i< n ; i++)
        // {
        //     for (int j = 0; j< n ; j++)
        //     {
        //         if(nums[i] + nums[j] == target && i != j)
        //         {
        //             return new int[]  {i,j};
        //         }
        //     }
        // }
        // return new int[] {-1,-1};
        int n = nums.length;
        HashMap<Integer , Integer> mp = new HashMap<>();
        for(int i = 0; i< n ;i++)
        {
            int x = target - nums[i];
            if(mp.containsKey(x))
            {
                return new int [] {i, mp.get(x)};
            }
            else
            {
                mp.put(nums[i], i);
            }
        }
        return new int [] {-1,-1};
        
    }
}