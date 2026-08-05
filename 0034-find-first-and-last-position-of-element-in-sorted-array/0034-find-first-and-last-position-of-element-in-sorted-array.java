class Solution {
    public static int lowerbount(int [] nums , int target)
    {
         int n = nums.length;
         int ans = -1;
        int low = 0;
        int high = n-1;
        while(low <= high)
        {
            int mid = (low+high)/2;
            if(nums[mid] == target)
            {
                ans = mid;
                high = mid -1;
            
            }
            else if(nums[mid] < target){
                low = mid +1; 
            }
            else{
                high = mid -1;
            }
        }
        // if (nums[ans] != target ) return -1;
        return ans;
    }
    public static int upperBound(int [] nums , int target)
    {
         int n = nums.length;
         int ans = -1;
        int low = 0;
        int high = n-1;
        while(low <= high)
        {
            int mid = (low+high)/2;
            if(nums[mid] == target)
            {
                ans = mid;
                low = mid+1;
            
            }
            else if(nums[mid] < target)
            {
                low = mid+1;
        }
        else{
            high = mid -1;
        }
        }
        // if (nums[ans] != target ) return -1;
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int [] ans = {-1 ,-1};

        if(nums.length == 0)return ans;
        ans[0]= lowerbount(nums ,target);
        ans[1] = upperBound(nums ,target);
        // if (nums[upperBound(nums ,target)-1] != target) ans[1] = -1;
        return ans;
        
    }
}