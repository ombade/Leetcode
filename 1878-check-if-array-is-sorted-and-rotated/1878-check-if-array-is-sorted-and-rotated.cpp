class Solution {
public:
    bool check(vector<int>& nums) {
        int count = 0;
        int n = nums.size();
        
        for (int i = 0; i < n; i++) {
            // Compare the current element with the next (circular comparison)
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
            // If there is more than one "drop", it's not a rotated sorted array
            if (count > 1) {
                return false;
            }
        }
        return true;
    }
};
