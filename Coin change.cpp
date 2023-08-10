class Solution {
  public:
    long long int count(int coins[], int N, int sum) {
        vector<long long> dp(sum + 1,0);
        dp[0] = 1;
        for(int i=0;i<N;i++){
            for(int j=0;j<=sum-coins[i];j++){
                dp[j + coins[i]] += dp[j];
            }
        }
        return dp[sum];
        // code here.
    }
};
