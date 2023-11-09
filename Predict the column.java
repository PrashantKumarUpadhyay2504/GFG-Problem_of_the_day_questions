 int m=0, result=-1,mi=0;
        int count =0,i=0,j=0,k=1;
        while(i<n){
            while(j<k){
                if(arr[i][j]==0)
                    count++;
                m=Math.max(m,count);
                if(mi<count)
                    result=j;
                mi=m;
                j++;
            }
            if(i==n-1&&j<n){
                i=0;
                k++;
                j=k-1;
                count=0;
            }
            else{
              i++;
              j=k-1;
            } 
        }
        return result;
