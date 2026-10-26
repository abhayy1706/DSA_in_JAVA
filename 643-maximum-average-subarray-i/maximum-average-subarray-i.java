class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int low=0;
        int high=k-1;
        double sum=0;
        for(int i=low;i<=high;i++){
            sum+=nums[i];
        }
        double maxavg=sum;
        while(high<nums.length){
            maxavg=Math.max(maxavg,sum);
            low++;
            high++;
            if(high==nums.length)break;
            sum-=nums[low-1];
            sum+=nums[high];
        }
        return maxavg/k;
    }
}