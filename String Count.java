//User function Template for Java
class Solution 
{ 
static long countStr(long n)
{
        // code here
        if(n==1) return 3;
        if(n==2) return 8;
        long p1 = 8, p2=5, p3=3;
        for(int i=3; i<=n; i++){
            p3 += 3;
            p2 += p3;
            p1 += p2;
        }
        return p1;

}
}
