 int i=0,j=0;
        int dp[][]=new int[m+1][n+1];
        
        for(i=1;i<=m;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(X.charAt(i-1)==Y.charAt(j-1))
                {
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    int x=dp[i][j-1];
                    int y=dp[i-1][j];
                    int z=x>y?x:y;
                    dp[i][j]=z;
                }
            }
        }
        
        //sum of length of both string minus length of LCS
        return m+n-dp[m][n];
