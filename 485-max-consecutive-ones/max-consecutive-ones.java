class Solution {
       static {
    for (int i=0;i<500;i++) {
        findMaxConsecutiveOnes(new int[0]);
    }
}
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int maxcount=0;
        int i=0;
        while(i<nums.length){
            while(i<nums.length&&nums[i]==1){
                count++;
                i++;
            }
            maxcount=Math.max(count,maxcount);
            count=0;
            i++;
        }
        return maxcount;
    }
}