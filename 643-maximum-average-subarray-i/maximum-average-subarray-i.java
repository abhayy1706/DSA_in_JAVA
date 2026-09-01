class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        int i=0;
        while(i<k){
            sum+=nums[i];
            i++;
        }
        double maxavg=sum;
        while(i<nums.length){
            sum+=nums[i]-nums[i-k];
            maxavg=Math.max(maxavg,sum);

            i++;
        }
        return maxavg/k;
    }
}