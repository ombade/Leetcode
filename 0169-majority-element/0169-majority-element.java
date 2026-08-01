class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer ,Integer> mp = new HashMap<>();
        for(int i =0;i< nums.length ; i++)
        {
            mp.put(nums[i], mp.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer , Integer> ent : mp.entrySet())
        {
          if  (ent.getValue() > n/2) return ent.getKey();
        }
        return -1;
    }
}
