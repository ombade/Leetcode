class Solution {
    public boolean increasingTriplet(int[] nums) {
        // int n1 = 9999;
        // int n2 = 9999;
        // for(int num :nums)
        // {
        //     if(n1 < n2 && n2 < num)return true;
        //     n1= n2;
        //     n2 = num;

        // }
        // return false;
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        
        for (int num : nums) {
            if (num <= first) {
                first = num;
            } else if (num <= second) {
                second = num;
            } else {
                return true;
            }
        }
        return false;
    }
}