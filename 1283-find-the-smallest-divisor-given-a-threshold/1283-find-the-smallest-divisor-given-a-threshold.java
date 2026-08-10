class Solution {
    public static boolean possible (int [] nums , int div , int threshold)
    {
        int sum = 0;
        for(int i : nums)
        {
         sum += (int)Math.ceil((double) i / div);
        }
        return (sum <= threshold);
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int min =1;
        //  Arrays.stream(nums).min().getAsInt();
         int max = Arrays.stream(nums).max().getAsInt();
        //  for(int i =min ; i<= max; i++ )
        //  {
        //     if(possible(nums , i , threshold)) return i;
        //  }
       int  low = min;
       int  high = max;
        while(low <= high)
        {
            int mid = (low + high)/2;
             if(possible(nums , mid , threshold))
             {
                high = mid -1;
             } 
             else{
                low  = mid +1;
             }
        }
         return low;
        
    }
}