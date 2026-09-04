class Solution {
    public void duplicateZeros(int[] arr) {
        int countzero=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                countzero++;
            }
        }
           int i = n - 1;
            int j= n + countzero - 1;
            while(i>=0 && j>=0){
                if(j<n){
                    arr[j]=arr[i];
                }
                if(arr[i]==0){
                    j--;
                
                if(j<n){
                    arr[j]=0;
                }
            }
        
            i--;
            j--;
        }
    }
}