//User function Template for Java

class Solution{
    int longSubarrWthSumDivByK(int a[], int n, int k)
    {
        // Complete the function
       Map<Integer, Integer> map = new HashMap<>();
        
        map.put(0, -1);
        
        long sum = 0;
        
        int ans = 0;
        
        for(int i=0; i<n; i++) {
            sum += a[i];
            int mod_sum = (int)(sum%k);
            if(mod_sum < 0) {
                mod_sum += k;
            }
            
            if(map.containsKey(mod_sum)) {
                ans = Math.max(ans, i-map.get(mod_sum));
            } else {
                map.put(mod_sum, i);
            }
            
        }
        
        return ans;
    }
 
}
