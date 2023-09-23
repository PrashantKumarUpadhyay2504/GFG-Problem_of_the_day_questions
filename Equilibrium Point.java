class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long a[], int n) {
            
            long sum=0,sum2=0;
            if(n==0)
               return -1;
            if(n==1)
               return 1;
            for(int i=0;i<n;i++)
            {
                sum+=a[i];
            }
            sum2=sum;
            long sum1=a[0];
            for(int j=1;j<n;j++)
            {
                sum=sum-a[j]-sum1;
                if(sum==sum1)
                    return j+1;
                sum1+=a[j];
                sum=sum2;
                
            }
            return -1;
    }
}
