class Solution
{
    public:
    //Function to find the smallest positive number missing from the array.
    int missingNumber(int arr[], int n) 
    { 
        // Your code here
        for(int i = 0; i<n; ++i)
        {
            if(arr[i]<=0 || arr[i] == i+1 || arr[i]>n) continue;
            int x = arr[i];
            while(arr[x-1] != x)
            {
                int t = arr[x-1];
                arr[x-1] = x;
                if(t<=0 || t>n) break;
                x = t;
            }
        }
        for(int i = 0; i<n; ++i) if(arr[i] != i+1) return i+1;
        return n+1;
    }
}
