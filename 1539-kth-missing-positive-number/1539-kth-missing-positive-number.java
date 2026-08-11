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
        // for(int i = 1 ; i <= arr[n-1]+k ;i++)
        // {   
        //     if (!present(i, arr))
        //     {
        //         cnt++;
        //         if(cnt == k) return i;
        //     }
        // }
        // int low = 1;
        // int high = arr[n-1]+k;
        // while(low <= high)
        // {
        //     int mid = (low + high)/2;
        //     if (!present(mid, arr))
        //     {
        //         cnt++;
        //         if(cnt == k) return i;
        //     }
        // }
 int low = 0;
   int missing =0;
        int high = n-1;
        while(low <= high)
        {
            int mid  = (low + high)/2;
            missing = arr[mid] - (mid+1);
            if(missing < k)
            {
                low = mid +1;
            }
            else{
                high = mid -1;
            }
        }
       
        return low+k;
        
    }
}