class Solution {
    public boolean checkInclusion(String s1, String s2) {
    int k=s1.length();
    if(s1.length()>s2.length())return false;
    int[] freq1=new int[128];
    int [] freq2=new int[128];
    int low=0;
    int high=0;
    while(high<k){
        freq1[s1.charAt(high)]++;
        freq2[s2.charAt(high)]++;
        high++;
    }
    if(Arrays.equals(freq1,freq2))return true;
    while(high<s2.length()){
        freq2[s2.charAt(high)]++;
        freq2[s2.charAt(low)]--;
        low++;
        high++;
         if(Arrays.equals(freq1,freq2))return true;
         }
         return false;
    }
}