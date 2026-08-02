class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        HashSet<Integer> temp = new HashSet<>();
        int longest = 0;
        // int current = 0;

        for(int i = 0; i< n ; i++)
        {
            temp.add(nums[i]);
        }
        for(int i : temp)
        {
            if (!temp.contains(i-1))
            {
                int current = 0;
                int x = i;
                while(temp.contains(x))
                {
                    current = current+1;
                    longest = Math.max(longest , current);
                    x = x+1;

                }
            }
        }
        return longest;

    }
}