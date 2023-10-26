class Solution
{
    public int minOperation(int n)
    {
        //code here.
        if(n==2) return 2;
        if(n==1) return 1;
        if(n%2!=0){
            return 2+minOperation((n-1)/2);
        }
        else {
            return 1+minOperation(n/2);
        }
    }
}
