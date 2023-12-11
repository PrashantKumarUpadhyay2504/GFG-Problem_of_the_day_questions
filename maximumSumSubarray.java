long sum = 0, ans = 0;
        
        for(int i=0;i<K;i++) {
            sum += Arr.get(i);
        }
        
        ans = Math.max(ans, sum);
        
        int i=0;
        for(int j=K;j<N;j++) {
            sum -= Arr.get(i++);
            sum += Arr.get(j);
            
            ans = Math.max(ans, sum);
        }
        return ans;
