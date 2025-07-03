class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0 ; i< n ; i++)
        {
            int key = nums[i];
            int cnt = 0;

            for(int j = 0 ; j < n ; j++)
            {
                if(nums[i]== nums[j])
                {
                    cnt++;
                }
            }
            if(cnt > n/2) return nums[i];
        }
        return -1;
        
    }
}