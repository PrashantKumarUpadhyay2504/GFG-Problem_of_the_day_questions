 vector<vector<int>>temp;
        for(int i=0;i<N;i++){
            temp.push_back({F[i], S[i], i+1});
        }
        sort(temp.begin(), temp.end()); // sort the temp vector with respect to finish time 
        vector<int>res;
        res.push_back(temp[0][2]);
        int end_time=temp[0][0];
        for(int i=1;i<N;i++){
            if(temp[i][1]>end_time){
                res.push_back(temp[i][2]);
                end_time=temp[i][0];
            }
        }
        sort(res.begin(), res.end());
        return res;
