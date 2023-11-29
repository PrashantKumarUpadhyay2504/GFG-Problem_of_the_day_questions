 int odd=0, ev = 0;
        // counting degree of all nodes, odd and even degree nodes
        for(int i=0; i<V; i++){
            if( adj[i].size() % 2 == 0 ) ev++;
            else odd++;
        }
        
        // for undirected graph
        // euler circuit must have all node with even degree
        // euler circuit must have all even degree node with atmost 2 odd degree nodes
        if( ev == V ) return 2;
        else if( odd > 0 && odd==2 ) return 1;
        return 0;
