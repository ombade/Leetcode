class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        // brute force approch 
        // HashMap<Integer ,Integer> mp = new HashMap<>();
        // for(int i =0;i< nums.length ; i++)
        // {
        //     mp.put(nums[i], mp.getOrDefault(nums[i],0)+1);
        // }
        // for(Map.Entry<Integer , Integer> ent : mp.entrySet())
        // {
        //   if  (ent.getValue() > n/2) return ent.getKey();
        // }
        // return -1;
        // better approch 
        int cnt = 0;
        int ele = 0;
        for(int i = 0; i< n ; i++)
        {
            if(cnt == 0)
            {cnt=1;
                ele = nums[i];
            }
            else if( nums[i]== ele)
            {
                cnt++;
            }
            else{
                cnt--;
            }
        }
        int cnt1 =0;
        for(int i = 0; i< n ; i++)
        {
            if(ele == nums[i])cnt1++;
        }
        if(cnt1 >= n/2)return ele;
        return -1;
    }
}
