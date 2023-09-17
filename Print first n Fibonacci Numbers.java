class Solution
{
    //Function to return list containing first n fibonacci numbers.
    public static long[] printFibb(int n) 
    {
        //Your code here
        long arr[]=new long[n];
        long first=0;
        long second=1;
        arr[0]=1;
        
        for(int i=1;i<n;i++){
            long next=first+second;
            first=second;
            second=next;
            arr[i]=next;
        }
        return arr;
    }
}
