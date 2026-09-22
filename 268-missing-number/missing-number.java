class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int m=nums.length;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return ((m*(m+1)/2))-sum; 
    }
}