class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[101];
        int maxFreq = 0;
        for (int num : nums) {
            freq[num]++;
            maxFreq = Math.max(maxFreq, freq[num]);
        }
        int count = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == maxFreq) {
            count += freq[i];
            }
        }
        return count;
    }
}