class Solution {
    public static long sumOfPowers(long a, long b) {
        // code here
        int[] spf = new int[(int)b+1];
        for(int i=0;i<=b;i++)
            spf[i]=i;
            
        for(int i=2;i*i<=b;i++){
            if(spf[i]==i){
                for(int j=i*i;j<=b;j+=i){
                    if(spf[j]==j)
                        spf[j]=i;
                }
            }
        }
        long c=0;
        for(int i=(int)a;i<=b;i++){
            int n = i;
            while(n>1){
                int x = spf[n];
                n /= x;
                c++;
            }
            if(n>1)
                c++;
        }
        return c;
    }
}
