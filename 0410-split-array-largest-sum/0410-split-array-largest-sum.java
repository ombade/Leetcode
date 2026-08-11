class Solution {
     public boolean possible(int[] nums,int mid, int k) {
        int n = nums.length;
        int studentall = 1;
        int pages = 0;
        for(int i = 0; i< n; i++)
        {
            if (nums[i] > mid)return false;
            if (pages + nums[i] > mid )
            {
                studentall = studentall+1;
                pages = nums[i];

            }else{
                pages = pages+ nums[i];
            }
        }
        if(studentall <= k )return true ;
        return false;
     }
    public int splitArray(int[] nums, int k) {
        int low = Arrays.stream(nums).max().getAsInt();
         int high = Arrays.stream(nums).sum();
         int ans = -1;
         while(low <= high)
         {
            int mid = (low + high)/2;
            if(possible(nums , mid , k))
            {
                ans = mid;
                high = mid -1;
            }else{
                low = mid +1;
            }


         }
         return ans;
    }
}