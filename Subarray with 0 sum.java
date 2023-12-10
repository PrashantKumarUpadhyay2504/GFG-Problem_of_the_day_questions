class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        HashSet<Integer> h=new HashSet<>();
        //Your code here
        int sum=0;
        for(int i:arr){
            sum+=i;
            if(h.contains(sum)||sum==0) return true;
            h.add(sum);
        }
        return false;
    }
}
