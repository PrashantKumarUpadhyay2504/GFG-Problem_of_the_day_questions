class Solution
{
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root,int K)
    {
        //Your code here
         ArrayList <Integer> list = new ArrayList<>();
        list = inorder(root, list);
        return list.get(list.size()-K);
    }
    public ArrayList <Integer> inorder(Node root, ArrayList <Integer> list){
        if(root == null){
            return list;
        }

        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);

        return list;
    }
}
