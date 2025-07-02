class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length,i;
        boolean lastzero = false;
        int count = 0 ;
        for(i=0;i<n;i++){
            if(arr[i]==0 && count!=n-1){
                count++;
            }else if(arr[i]==0 && count==n-1){
                lastzero = true;
            }
            count++;
            if(count == n){
                break;
            }
        }
        int a = i, b = n-1;
        while(a!=b){
            arr[b] = arr[a];
            if(arr[b]==0 && lastzero==false){
                b--;
                arr[b] = 0;
            }else if(lastzero==true){
                lastzero = false;
            }
            a--;
            b--;
        }
    }
}