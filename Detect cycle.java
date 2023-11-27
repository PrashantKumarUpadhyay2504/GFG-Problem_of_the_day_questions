private:
    class DisjointSet{
    private:
        vector<int> SIZE,PARENT;
    public:
        DisjointSet(int n){
            SIZE.resize(n+1,1);
            PARENT.resize(n+1);
            for(int i=0; i<=n; i++)
                PARENT[i] = i;
        }
        int findUParent(int NODE){
            if(PARENT[NODE] == NODE) return NODE;
            return PARENT[NODE] = findUParent(PARENT[NODE]);
        }
        void unionBySize(int NODE_1,int NODE_2){
            int prnt_1 = findUParent(NODE_1);
            int prnt_2 = findUParent(NODE_2);
            if(prnt_1 == prnt_2) return;
            if(SIZE[prnt_1] < SIZE[prnt_2]){
                PARENT[prnt_1] = prnt_2;
                SIZE[prnt_2] += SIZE[prnt_1];
            }else{
                PARENT[prnt_2] = prnt_1;
                SIZE[prnt_1] += SIZE[prnt_2];
            }
        }
    };
