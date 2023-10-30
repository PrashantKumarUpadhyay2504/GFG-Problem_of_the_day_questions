class Solution{
   
    // Function for finding maximum and value pair
    public long sumXOR (int arr[], int n) {
        //Complete the function
        long ans=0;
        for(int i=0;i<32;i++)
        {
            int ones=0;
            for(int x:arr)
            {
                if((x&(1<<i))!=0)  
                    ones++;
            }
            ans+=(((long)ones*(n-ones))*(1<<i));
        }
        return ans;

    }
    
    
}
