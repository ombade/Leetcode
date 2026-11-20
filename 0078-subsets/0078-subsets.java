class Solution {
    public static void solve(int[] nums , int i ,int n , List<Integer>curr , List<List<Integer>>ans )
    {
        ans.add(new ArrayList<>(curr));
        for( ; i< n ; i++)
        {
            curr.add(nums[i]);
            solve(nums, i+1 ,n ,curr , ans);
           curr.remove(curr.size() - 1);

        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
       
        solve(nums , 0 ,nums.length, new ArrayList<>(),ans);
        return ans;
    }
}