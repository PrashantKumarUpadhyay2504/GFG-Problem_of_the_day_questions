class Solution {
    public static int findCatalan(int n) {
        // code here
         if (n <= 1) {
            return 1;
        }

        int MOD = 1000000007;
        int[] catalan = new int[n + 1];
        catalan[0] = 1;
        catalan[1] = 1;

        for (int i = 2; i <= n; i++) {
            catalan[i] = 0;
            for (int j = 0; j < i; j++) {
                catalan[i] = (int) ((catalan[i] + (long) catalan[j] * catalan[i - j - 1]) % MOD);
            }
        }

        return catalan[n];
    }
}
