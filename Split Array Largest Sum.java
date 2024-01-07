class Solution {
    static int splitArray(int[] arr, int N, int K) {
        long left = Arrays.stream(arr).max().getAsInt(); 
        long right = Arrays.stream(arr).sum(); 

        while (left < right) {
            long mid = left + (right - left) / 2;
            if (isPossible(arr, N, K, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return (int) left;
    }
    
    static boolean isPossible(int[] arr, int N, int K, long maxSum) {
        int count = 0;
        int currentSum = 0;
        
        for(int i = 0; i<N; i++) {
            currentSum += arr[i];
            
            if(currentSum > maxSum) {
                count++;
                currentSum = arr[i];
                
            }
        }
        
        count++;
        return count <= K;
    }
}
