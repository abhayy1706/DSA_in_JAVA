class Solution {
    public int longestSubarray(int[] nums) {
        int len = 0;
        int idx = 0;
        for(int i = 0;i<nums.length;i++){
            int zeroes = 0;
            int j = i;
            while(j<nums.length&&zeroes<=1){
            int window = nums[j];
            if(window==0){
                if(zeroes==0)idx=j;
                zeroes++;
            }
            j++;
        }
        if(zeroes<=1){
            len = Math.max(len,j-i-1);
            return len;
        }
       else {
        len = Math.max(len,j-i-2);
        i = idx;
       } 
    }
    return len;
  }
}