 int c=0,z=0,mx=INT_MIN;
        for(int i=0;i<n;i++)
        {
            if(a[i]==1)
            c++;
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]==0)
            {
                z++;
            }
            mx=max(mx,z);
            if(a[i]==1 and z>0)
            {
                z--;
            }
        }
        return mx+c;
