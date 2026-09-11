class Solution {
    public int maximumLengthSubstring(String s) {
        int[] freq=new int[128];
        int low=0;
        int max=0;
        for(int high=0;high<s.length();high++) {
            freq[s.charAt(high)]++;
            while(freq[s.charAt(high)]>2) {
                freq[s.charAt(low)]--;
                low++;
            }
            max=Math.max(max, high-low+1);
        }
        return max;
    }
}