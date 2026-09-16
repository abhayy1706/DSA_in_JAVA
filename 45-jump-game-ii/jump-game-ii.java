class Solution {
    public int jump(int[] nums) {
        int idx = 0;
        int jump = 0;
        while (idx < nums.length - 1) {
            int steps = nums[idx];
            int curr = -1;
            int maxidx = idx;
            for (int j = idx + 1; j <= idx + steps && j < nums.length; j++) {
                if (j == nums.length - 1)return jump + 1;
                if (j+nums[j] >= curr) {
                    curr =j+  nums[j];
                    maxidx = j;
                }
            }
            idx = maxidx;
            jump++;
        }
        return jump;
    }
}