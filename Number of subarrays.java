long long int i=0,res = 0,range=0;
        for(long long int j=0;j<n;j++)
         {
             if(a[j]>=l && a[j]<=r)
               range = j-i+1;
               
             else if(a[j]>r)
                   range = 0,i=j+1;
                   
             res+=range;
         }
        return res;
