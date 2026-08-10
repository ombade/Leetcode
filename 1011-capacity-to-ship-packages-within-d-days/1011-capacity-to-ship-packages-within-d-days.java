class Solution {
    public static boolean possible(int arr[] , int wt , int days)
    {
        int currentweight = 0;
        int noOfDay = 1;
        int n = arr.length;
        for(int i = 0 ; i< n ; i++)
        {
            int temp = currentweight + arr[i];
            if(temp <= wt)
            {
                currentweight += arr[i];
            }
            else{
                currentweight = arr[i];
                noOfDay = noOfDay +1;
            }
        }
        return (noOfDay <= days);
    }
    public int shipWithinDays(int[] weights, int days) {
        
        int low = Arrays.stream(weights).max().getAsInt();
        int high =Arrays.stream(weights).sum();
        while(low <= high)
        {
            int mid = (low +high)/2;
            if(possible(weights ,mid,days))
            {
                high = mid -1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
}