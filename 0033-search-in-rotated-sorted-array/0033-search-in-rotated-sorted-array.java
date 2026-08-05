class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while(low <= high)
        {
            int mid = (low +high)/2;
            if(nums[mid] == target)
            {
                return mid;
            }
            else if (nums[low] <= nums[mid])
            {
                if(nums[low] <= target && target < nums[mid] )
                {
                    high = mid-1;
                }
                else{
                    low = mid +1;
                }
            }
            else {

                // If target lies within sorted right part
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                }
                // Else, search in left half
                else {
                    high = mid - 1;
                }
        }
        
    }
    return -1;
    }
}