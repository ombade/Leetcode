class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> ans = new HashSet<>();
        int n = nums.length;
        for(int i = 0 ; i< n ; i++)
        {
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int low = i+1;
            int high = n-1;
            while(low < high)
            {
                int sum = nums[i] + nums[low] + nums[high];
                 if(sum > 0 )
                 {
                    high--;
                 }
                 else if(sum < 0)
                 {
                    low++;
                 }
                 else
                 {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                     temp.add(nums[low]);
                      temp.add(nums[high]);
                      ans.add(temp);
                      high--;
                      low++;
                 }
            }
        }
         List<List<Integer>> anss = new ArrayList<>();
         for(List row : ans)
         {
            anss.add(row);
         }
        return anss;
        
    }
}