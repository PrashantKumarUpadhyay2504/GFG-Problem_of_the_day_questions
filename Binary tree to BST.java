class Solution
{
    // The given root is the root of the Binary Tree
    // Return the root of the generated BST
    static int index=0;
    Node binaryTreeToBST(Node root)
    {
       // Your code here
       List<Integer> sortedList=new ArrayList<>();
      index=0;
      sortInorder(root,sortedList);
      Collections.sort(sortedList);
      convertToBst(root,sortedList);
      return root;
    }
    
    void sortInorder(Node root,List<Integer> list){
        if(root==null)
        return;
        sortInorder(root.left,list);
        list.add(root.data);
        sortInorder(root.right,list);
    }
    
    void convertToBst(Node root,List<Integer> list){
       if(root==null)
        return;
        convertToBst(root.left,list);
        root.data=list.get(index);
        index++;
        convertToBst(root.right,list);
    }
}
