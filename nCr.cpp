class Solution {
public:
    int nCr(int n, int r){
        int const MOD= 1e9+7;
    
        vector<vector<int>>dp(n+1,vector<int>(r+1));
        
        for(int i=0; i<=n ;i++){
            for(int j=0; j<= min(i,r); j++){
                if(j==0) dp[i][j]=1;
                
               else dp[i][j]= (dp[i-1][j]%MOD+ dp[i-1][j-1]%MOD)%MOD;
            }
        }
        
        return dp[n][r];  
    }
};
