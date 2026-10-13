class Solution {
    public int[] sortedSquares(int[] nums) {
        int [] arr=new int[nums.length];
        int k=arr.length-1;
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int leftsq=nums[left]*nums[left];
            int rightsq=nums[right]*nums[right];
             if(leftsq<rightsq){
                arr[k]=rightsq;
                right--;
             }
             else{
                arr[k]=leftsq;
                left++;
             }
             k--;
        }
        return arr;
    }
}