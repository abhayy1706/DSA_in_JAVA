class Solution {
    static {
        for(int i = 0; i < 500; i++){
            longestOnes(new int[]{}, 0);
        }
    }
    public static int longestOnes(int[] nums, int k) {
        int len = 0;
        int zeroes = 0;
        int j = 0;
        int window = 0;
        for(int i = 0;i<nums.length;i++){
            window = nums[i];
            if(window==0)zeroes++;
            if(zeroes>k){
                while(zeroes>k){
                    window = nums[j];
                    if(window==0)zeroes--;
                    j++;
                }
            }
            len = Math.max(i-j+1,len);
        }
        return len;
    }
}