int xx=0;
        for(int i=0;i<n;i++)    xx^=A[i];
        if(xx==0)   return 1;
        return n%2==0?1:2;
