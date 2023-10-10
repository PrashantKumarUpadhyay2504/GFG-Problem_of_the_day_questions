 ArrayList<Node> ntrp = nodeToRootPath(root, target);
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < ntrp.size(); i++){
            addKLevelsDown(ntrp.get(i), k - i, ans, i == 0? null: ntrp.get(i - 1));
        }
        
        Collections.sort(ans);
        return ans;
    }
    
    static void addKLevelsDown(Node node, int level, ArrayList<Integer> ans, Node blocker){
        if(node == null || level < 0 || node == blocker){
            return;
        }
        
        if(level == 0){
            ans.add(node.data);
            return;
        }
        
        addKLevelsDown(node.left, level - 1, ans, blocker);
        addKLevelsDown(node.right, level - 1, ans, blocker);
    }
    
    static ArrayList<Node> nodeToRootPath(Node node, int target){
        if(node == null){
            ArrayList<Node> bl = new ArrayList<>();
            return bl;
        }
        
        
        if(node.data == target){
            ArrayList<Node> li = new ArrayList<>();
            li.add(node);
            
            return li;
        }
        
        if(node.left != null){
            ArrayList<Node> ll = nodeToRootPath(node.left, target);
            
            if(ll.size() > 0){
                ll.add(node);
                return ll;
            }
        }
        
        if(node.right != null){
            ArrayList<Node> rl = nodeToRootPath(node.right, target);
            
            if(rl.size() > 0){
                rl.add(node);
                return rl;
            }
        }
        
        return new ArrayList<Node>();
