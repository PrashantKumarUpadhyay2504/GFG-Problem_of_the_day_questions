class Solution
{    public int countSetBits(int m){
    if(m == 0) return 0;
    int count = 0;
    while(m>0){
        count++;
        m = m & (m-1);
    }
    return count;
}
    public int is_bleak(int n)
    {
        // Code here
        for(int i = Math.max(n-32,1); i<n; i++){
            if(i+countSetBits(i) == n) return 0;
        }
        return 1;
    }
}
