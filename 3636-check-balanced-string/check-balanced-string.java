class Solution {
    public boolean isBalanced(String num) {
        int evencount=0;
        int oddcount=0;
        for(int i=0;i<num.length();i++){
            int d=(int)num.charAt(i)-'0';
            if(i%2==0)evencount+=d;
            else oddcount+=d;
        }
        return evencount==oddcount;
    }
}