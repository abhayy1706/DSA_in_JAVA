class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        int low=0;
        int high=k-1;
        for(int i=low;i<=high;i++){
            sum+=nums[i];
        }
        double maxavg=sum;
        while(high<nums.length){
             maxavg=Math.max(maxavg,sum);
            low++;
            high++;
            if(high==nums.length)break;
            sum=sum-nums[low-1];
            sum=sum+nums[high];
           
        }
        return maxavg/k;
    }
}