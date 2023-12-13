 if (n == 1) return 2;
        int mod = (int)1e9+7;
        long f = 1;
        long s = 2;
        for (int i = 2; i <= n; i++) {
            long temp = (f % mod + s % mod) % mod;
            f = s;
            s = temp;
        }
        
        return s;
