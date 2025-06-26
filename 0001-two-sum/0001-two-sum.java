class Solution {
    public int[] twoSum(int[] nums, int target) {
        // List<integer> ans= new ArrayList();
    //     for(int i =0 ; i< nums.length ; i++)
    //     {
    //         for(int j =i+1; j < nums.length; j++)
    //         {
    //             if(nums[i] + nums[j]== target)
    //             {
    //                return new int[]{i,j};
    //             }
    //         }
    //     }
    //     return new int[0];
        
    // }
//     Arrays.sort(nums);
//     int start = 0;
//     int end = nums.length -1;

//     while(start < end )
//     {
//         int m = nums[start] + nums[end];
//         if(m == target)
//         {
//             return new int[]{nums[start] ,nums[end]};
//         }
//         if (m  < target)
//         {
//             start ++;
//         }
//         else
//         end --;
//     }
// return new int[0];
HashMap<Integer , Integer> map = new HashMap<>();
for(int i =0; i< nums.length ; i++)
{
    int diff = target - nums[i];
    if(map.containsKey(diff))
        {return new int[]{map.get(diff), i};}

    map.put(nums[i] ,i );
}
return new int[0] ;
}
    }
    