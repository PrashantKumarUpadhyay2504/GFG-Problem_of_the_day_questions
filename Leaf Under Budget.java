class Solution{
    public int getCount(Node root, int x)
    {
        //code here  
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,1));
        int val=0,ans=0;
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=0;i<n;i++){
                Pair p=q.poll();
                Node curr=p.root;
                int count=p.level;
                if(curr.left!=null){
                    q.add(new Pair(curr.left,count+1));
                }
                if(curr.right!=null){
                    q.add(new Pair(curr.right,count+1));
                }
                if(curr.left==null&&curr.right==null){
                    val+=count;
                    if(val<=x){
                        ans++;
                    }
                    else{
                        break;
                    }
                }
            }
        }
        return ans;
    }
}
