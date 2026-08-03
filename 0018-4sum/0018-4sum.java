class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
          List< List<Integer>> anss = new ArrayList<>();
        if(n < 4) return anss;
        Arrays.sort(nums);
        Set<List<Integer>> temp = new HashSet<>();
        for(int i = 0; i< n ; i++)
        {
            if(i> 0 && nums[i] == nums[i-1])continue;
            for(int j = i+1 ; j<n ; j++)
            {
                if (j > i+1 && nums[j] == nums[j-1]) continue;
                int low = j+1;
                int high = n-1;
                while(low < high)
                {
                    long sum = (long )(nums[i] + nums[j]) + (nums[low] + nums[high]);
                    if(sum > target) high--;
                    else if(sum < target) low++;
                    else{
                        List<Integer> ans = new ArrayList<>();
                        Collections.addAll(ans , nums[i], nums[j], nums[low], nums[high]);

                    temp.add(ans);
                    high--;
                    low++;

                    }
                }
            }
        }
    //    List< List<Integer>> anss = new ArrayList<>();
        for(List li : temp)
        {anss.add(li);

        }
        return anss;
        
    }
}