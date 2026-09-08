class Solution {
    public int maxVowels(String s, int k) {
    int count=0;
    for(int i=0;i<k;i++){
        if(isVowel(s.charAt(i))){
            count++;
        }
    }
    int max=count;
    int i=k;
    while(i<s.length()){
        if(isVowel(s.charAt(i-k))){
            count--;
        }
        if(isVowel(s.charAt(i))){
            count++;
        }
        max=Math.max(max,count);

        i++;
    }
    return max;
    }
         public boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i'
            || c == 'o' || c == 'u';
    }
}