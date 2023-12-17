class Solution{
public:	
	// calculate the maximum sum with out 
	int dynamic( int arr[], int n, vector<int>&dp)
	{
	    //base conditon
	    if(n<0)
	    return 0;
	    
	    if(n==0)
	    return arr[0];
	    
	    
	    if(dp[n]!=-1)
	    return dp[n];
	    
	    int pick = arr[n]+ dynamic(arr , n-2, dp);
	    
	    int notpick = 0+ dynamic(arr,n-1,dp);
	    
	    return dp[n] = max(pick ,notpick);
	    
	}
	int findMaxSum(int *arr, int n) {
	    vector<int>dp(n+1,-1);
	    
	     return dynamic(arr, n-1 ,dp);
	    // code here
	}
};
