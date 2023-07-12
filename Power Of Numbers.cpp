class Solution{
    public:
    //You need to complete this fucntion
    
    long long power(int N,int R)
    {
       //Your code here
             const long mod = 1000000007;
         if(R==0) return 1;
       if(R==1) return N;
      long long ans = power(N,R/2);
       if(R%2==0) {
           ans  = (ans*ans) % mod;
       }
       else{
           ans = (((N%mod) * (ans%mod) % mod) * (ans%mod)) %mod;
       }
        return ans;  
    }

};
