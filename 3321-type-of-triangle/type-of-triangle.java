class Solution {
    public String triangleType(int[] nums) {
        int a = nums[0], b = nums[1], c = nums[2];
        int max = Math.max(a, Math.max(b, c));
        if (a + b + c - max <= max) return "none";
        if (a == b && b == c) return "equilateral";
        if (a == b || b == c || a == c) return "isosceles";
        return "scalene";
    }
}