class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Arrays.sort(nums);
        // int n = nums.length;
        // for(int i =1 ; i< n ; i++)
        // {
        //     if(nums[i] == nums[i-1]) return true;
        // }
        // return false ;
        HashSet<Integer> hs = new HashSet<>();
        for(int n : nums)
        {
            if(hs.contains(n))return true;
            hs.add(n);
        }
         return false;
    }
   
}