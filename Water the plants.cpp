//User function Template for C++

class Solution{
    public:
    static bool cmp(pair<int,int>&a,pair<int,int>&b){
        return a.second > b.second;
    }
    int min_sprinklers(int gallery[], int n)
    {
        // code here
        vector<pair<int,int>>v(n);
        for(int i=0;i<n;i++){
            int l = (i-gallery[i]<0)?0:i-gallery[i];
            int r = (i+gallery[i]>=n)?n-1:i+gallery[i];
            
            if(gallery[i]==-1){l=-1,r=-1;}
            v[i] = {l,r};
        }
        sort(v.begin(),v.end(),cmp);
        // for(auto val:v){
        //     cout<<"("<<val.first<<","<<val.second<<") ";
        // }cout<<endl;
        int ans=0;
        int endpoint = n;
        for(int i=0;i<n;i++){
            if(v[i].first==-1)continue;
            if(v[i].second<endpoint-1 and endpoint>0){
                return -1;
            }
            else{
                if(endpoint==0)return ans;
                ans++;
                int nextEndpoint = endpoint;
                while(i<n and v[i].second>=endpoint-1){
                    nextEndpoint = min(nextEndpoint,v[i].first);
                    i++;
                }
                endpoint = nextEndpoint;
                i--;
            }
        }
        return ans;
    }
};
