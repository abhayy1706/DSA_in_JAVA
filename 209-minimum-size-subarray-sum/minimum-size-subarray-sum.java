class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low=0,high=0,sum=0;
        int result=Integer.MAX_VALUE;
        while(high<nums.length){
            sum+=nums[high];
            while(sum>=target){
                int length=high-low+1;
                result=Math.min(result,length);
                sum-=nums[low];
                low++;
            }
            high++;
        }
        return result==Integer.MAX_VALUE? 0 : result;
    }
}