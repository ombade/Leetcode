class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int pos  = 0;
        int temp[] = new int[n];
        int neg = 1;
        for(int i = 0 ; i< n ; i++)
        {
            if(nums[i] > 0)
            {
                temp[pos] = nums[i];
                pos = pos+2;
            }
            else{
                temp[neg]= nums[i];
                neg = neg+2;
            }
        }
        return temp;
        
    }
}