class Solution {
    public int[] getAverages(int[] nums, int k) {
        int[] result=new int[nums.length];
          java.util.Arrays.fill(result, -1);
         if (k == 0) {
            return nums;
        }
        int windowSize=2*k+1;
         if (windowSize > nums.length) {
            return result;
        }
        long sum=0;
        int s=0;
        int f=0;
        while(f<windowSize){
            sum+=nums[f];
            f++;
        }
        int i=k;
        result[i]=(int)(sum/windowSize);
        while(f<nums.length){
            sum+=nums[f];
            sum-=nums[s];
            result[++i]=(int)(sum/windowSize);
            s++;
            f++;
        }
        return result;
    }
}