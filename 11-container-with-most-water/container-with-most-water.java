class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int maxzero=0;
        while(i<j){
            int width=j-i;
            int min=Math.min(height[i],height[j]);
            int water=min*width;
            maxzero=Math.max(maxzero,water);
            if(height[i]<height[j])i++;
            else j--;
        }
        return maxzero;
    }
}