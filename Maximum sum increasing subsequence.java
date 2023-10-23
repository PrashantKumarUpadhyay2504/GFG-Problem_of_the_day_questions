int omax=arr[0];
	    int dp[]=new int[n];
	    dp[0]=arr[0];
	    for(int i=1;i<n;i++){
	        int max=0;
	        for(int j=0;j<n;j++){
	            if(arr[j]<arr[i])  max=Math.max(max,dp[j]);
	        }
	        dp[i]=max+arr[i];
	        omax=Math.max(omax,dp[i]);
	    }
	 return omax;
