class Solution {
    public boolean checkIfPangram(String sentence) {
        for(char start='a'; start<='z'; start++){
            if(sentence.indexOf(start) == -1){
                return false;
            }
        }
        return true;
    }
}