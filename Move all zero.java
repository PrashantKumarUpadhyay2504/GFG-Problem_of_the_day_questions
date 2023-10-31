class Solution {
    void pushZerosToEnd(int[] arr, int n) {
        // code here
        int j=0;
        for(int num : arr) if(num != 0) arr[j++] =num;
        for(; j<n; j++) arr[j]=0;
    }
