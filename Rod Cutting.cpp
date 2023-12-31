class Solution{
    int f(int n,int price[],vector<int> &dp)
    {
        if(n<0) return -1e9;
        if(n==0) return 0;
        if(dp[n]!=-1) return dp[n];
        int maxi=0;
        for(int i=0;i<n;i++)
        {
            maxi=max(maxi,price[i]+f(n-(i+1),price,dp));
        }
        return dp[n]=maxi;
    }
  public:
    int cutRod(int price[], int n) {
        vector<int> dp(n+1,-1);
        return f(n,price,dp);
    }
};
