if(n <= 1) {
            return 0;
        }
        
        if(n % 3 == 0) {
            return minStep(n / 3) + 1;
        }
        
        return minStep(n - 1) + 1;
