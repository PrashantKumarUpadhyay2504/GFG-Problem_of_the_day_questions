class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {
        return Tabulation(arr, n);
        // Your code here
    }
    public int Tabulation(int arr[], int n){
        int[] dp = new int[n+1];
        int prev1 = arr[0]; 
        int prev2 = Math.max(arr[0], arr[1]);
        for(int idx=2; idx<n; idx++) {
            int curr=Math.max(prev2, arr[idx]+prev1);
            prev1=prev2;
            prev2=curr;
        }
        
        return prev2;
    }
    
    
    
    
    
    
}
