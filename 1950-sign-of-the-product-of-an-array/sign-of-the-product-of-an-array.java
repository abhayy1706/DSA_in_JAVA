class Solution {
    public int arraySign(int[] nums) {
        int product=1,i=0,n=nums.length;
        while (i<n){
            int v=nums[i++];
            if(v==0)return 0;
            if(v<0)product=-product;
        }
        return product;
    }
}