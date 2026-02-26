class Solution {
    public void rev(int [] arr , int start , int end)
    {
        while(start < end )
        {int temp = arr[start];
        arr[start]= arr[end];
        arr[end]= temp;
        start++;
        end --;

        }
    }
    public void rotate(int[] nums, int k) {
       int n = nums.length;
        if(n == 1 || n== 0 || k == n)return;

        k = k%n;
        rev(nums, 0,nums.length-1);
        rev(nums, 0,k-1);
        rev(nums, k,nums.length-1);
    }
}