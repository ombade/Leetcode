class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer , Integer> mp = new HashMap<>();
        mp.put(0,1);
        int result =0;
        int n = nums.length;
        int sum =0;
        for(int i = 0 ;i< n ; i++)
        {
            // int temp = k - nums[i];
            sum = sum+ nums[i];
            int temp = sum -k;
            if(mp.containsKey(temp))
            {
                result = result+ mp.get(temp);

            }
           
                mp.put(sum , mp.getOrDefault(sum,0)+1);
            

        }
        return result;
        
    }
}