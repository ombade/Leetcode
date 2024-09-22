class Solution {
    public boolean containsDuplicate(int[] nums) {
        // nums.sort();

        // This is the basic approch where the sort the array and if arrr  and arr next is same then return true ;
    //     Arrays.sort(nums);
    //   for(int i =1 ; i< nums.length; i++)
    //   {
    //     if(nums[i-1]== nums[i])
    //     {
    //         return true ;
    //     }
    //   }
    //   return false;
    // }


    // approch 2 using hashset 
    HashSet<Integer> seen = new HashSet<>();
    for(int num : nums)
    {
        if(seen.contains(num))
            return true ;
        seen.add(num);
    }
    return false;
}
}