class Solution {
    public static boolean present(int target , int arr[])
    {
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(target == arr[i])return true;
        }
        return false;
    }
    public int findKthPositive(int[] arr, int k) {
        int cnt = 0;
        int n = arr.length;
        for(int i = 1 ; i <= arr[n-1]+k ;i++)
        {   
            if (!present(i, arr))
            {
                cnt++;
                if(cnt == k) return i;
            }
        }
        return -1;
        
    }
}