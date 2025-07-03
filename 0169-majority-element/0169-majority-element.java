class Solution {
    // brute force approch 
    // public int majorityElement(int[] nums) {
    //     Arrays.sort(nums);
    //     int n = nums.length;
    //     for(int i = 0 ; i< n ; i++)
    //     {
    //         int key = nums[i];
    //         int cnt = 0;

    //         for(int j = 0 ; j < n ; j++)
    //         {
    //             if(nums[i]== nums[j])
    //             {
    //                 cnt++;
    //             }
    //         }
    //         if(cnt > n/2) return nums[i];
    //     }
    //     return -1;
        
    // }
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int cnt = 1;
        int n = nums.length;
        if(n ==1) return nums[0];
        for(int i =1; i< n ; i++)
        {
            if(nums[i]==nums[i-1])
            {
                cnt++;
                if(cnt > n/2)return nums[i];
            }
            else
                cnt= 1;
        }
        return -1;
    }
    // optmize approch 
    //  public int majorityElement(int[] nums) {
    //     int cnt = 0;
    //     int el=0;
    //     for(int i = 0; i< nums.length; i++)
    //     {
    //         if(cnt == 0)
    //         {
    //             cnt =1;
    //             el = nums[i];
    //         }
    //         else if(nums[i] == el) cnt++;
    //         else
    //             cnt--;
    //     }
    //     cnt = 0;
    //     for(int j =0 ; j< nums.length ; j++)
    //     {
    //         if(nums[j] == el) cnt++;

    //     }
    //     if(cnt > nums.length/2) return el;
    //     else 
    //         return -1;
    //  }
}