Node start=null;
    Node bTreeToClist(Node root)
    {
        inorder(root);
        return start;
    }
    void inorder(Node root)
    {
        if(root == null)
            return;
        inorder(root.left);
        
        addNode(root.data);
        
        inorder(root.right);
    }
    void addNode(int data)
    {
        Node n=new Node(data);
        if(start == null)
        {
            start=n;
            start.left=n;
            start.right=n;
        }
        else
        {
            n.right=start;
            n.left=start.left;
            start.left.right=n;
            start.left=n;
        }
    }
