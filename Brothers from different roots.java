X=x;
map=new HashMap<>();
count=0;
recurse(root1);
recurse1(root2);
return count;
}
   static void recurse(Node root){
    if(root!=null){
        map.put(root.data,1);
        recurse(root.left);
        recurse(root.right);
    }
}
static void recurse1(Node root){
    if(root!=null){
        if(map.get(X-root.data)!=null) count++;
        recurse1(root.left);
        recurse1(root.right);
    }
