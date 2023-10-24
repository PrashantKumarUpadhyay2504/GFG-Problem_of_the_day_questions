class Solution{
      static boolean check(String str,int i,int j)
    {
        while(i<=j)
        {
            char ch=str.charAt(i);
            char c=str.charAt(j);
            if(ch!=c)
            return false;
            i++;
            j--;
        }
        return true;
    }
    static int count(String str,int i,int j,int[][] dp)
    {
        if(j==str.length())
        {
            if(check(str,i,j-1))
            {
                return 0;
            }
            return 99999999;
        }
        if(dp[i][j]!=0)
        {
            return dp[i][j];
        }
        int take=999999,ntake=9999999,np=999999;
        if(check(str,i,j))
        {
            take=1+count(str,j+1,j+1,dp);
            ntake=count(str,i,j+1,dp);
            
        }
        else{
            np=count(str,i,j+1,dp);
        }
        return dp[i][j]=Math.min(take,Math.min(ntake,np));
    }
    static int palindromicPartition(String str)
    {
        // code here
        int [][] dp=new int[str.length()][str.length()];
        return count(str,0,0,dp);
    }
}
