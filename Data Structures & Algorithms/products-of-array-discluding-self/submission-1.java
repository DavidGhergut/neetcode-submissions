class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length, sufix = 1;
        int[] res = new int[n];
        res[0] = 1;

        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            res[i] *= sufix;
            sufix *= nums[i];
        }

        return res;
    }
}  
