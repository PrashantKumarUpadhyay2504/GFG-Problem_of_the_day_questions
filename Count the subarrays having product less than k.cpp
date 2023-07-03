class Solution{
  public:
    int countSubArrayProductLessThanK(const vector<int>& a, int n, long long k) {
         if (k <= 1) return 0;

        long long head = 0, tail = 0, prod = 1, ans = 0;

        for (int head = 0; head < n; head++) {
            prod *= a[head];
            while (prod >= k) {
                prod /= a[tail];
                tail++;
            }

            ans = ans + (head - tail + 1);
        }

        return ans;
    }
}
