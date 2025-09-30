class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int product = 1;
        int zeroCount = 0;

        // First pass: calculate product of non-zero numbers and count zeros
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            } else {
                product *= nums[i];
            }
        }

        int[] ans = new int[n];

        // If more than one zero → all results are zero
        if (zeroCount > 1) {
            return ans; // already all zeros
        }

        // If exactly one zero → only the position of zero gets product, rest are 0
        if (zeroCount == 1) {
            for (int i = 0; i < n; i++) {
                if (nums[i] == 0) {
                    ans[i] = product;
                } else {
                    ans[i] = 0;
                }
            }
            return ans;
        }

        // If no zero → safe to divide
        for (int i = 0; i < n; i++) {
            ans[i] = product / nums[i];
        }

        return ans;
    }
}
