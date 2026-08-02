class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        int n = nums.length;
        Integer cnt = 0;
        for (int i = 0; i < n; i++) {
            if (map.get(nums[i]) == null)
                cnt = 0;
            else 
                cnt = map.get(nums[i]);
            if (cnt == null)
                map.put(nums[i], 1);
            else
                map.put(nums[i], cnt + 1);
            if (map.get(nums[i]) == 2)
                return true;
        }
        return false;
    }
}