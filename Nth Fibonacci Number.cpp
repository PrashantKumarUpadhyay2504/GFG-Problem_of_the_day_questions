class Solution {
  public:
    int nthFibonacci(int n){
        // code here
        int mod=1e9+7;
        if (n<3)
            return 1;
        int a=1,b=1,ans;
        for (int i=3; i<=n; i++){
            ans=(a+b)%mod;
            a=b;
            b=ans;
        }
        return ans;
    }
};
