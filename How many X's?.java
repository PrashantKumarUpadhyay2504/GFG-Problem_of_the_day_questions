int cnt = 0;
        
        for(int i = L + 1; i <= R-1; i++){
            
            int n = i;
            while(n != 0){
                if(n % 10 == X)cnt++;
                n = n / 10;
            }
        }
        
        return cnt;
