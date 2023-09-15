class Solution{
    static int equalPartition(int N, int arr[])
    {
        // code here
        int s=0;
        for(int i:arr)
            s+=i;
        if(s%2!=0)
            return 0;
            
        int sum=s/2;
        
        boolean [][]dp=new boolean[N+1][sum+1];
        dp[0][0]=true;
        
        for(int i=1;i<=N;i++)
        {
            for(int j=0;j<=sum;j++)
            {
                if(j<arr[i-1])
                    dp[i][j]=dp[i-1][j];
                else
                    dp[i][j]=dp[i-1][j]||dp[i-1][j-arr[i-1]];
            }
        }
        
        if(dp[N][sum]==true)
            return 1;
        return 0;
    }
}
