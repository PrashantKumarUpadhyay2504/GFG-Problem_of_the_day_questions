class Solution {
    //Function to find the height of a binary tree.
    int height(Node node) 
    {
        // code here 
        if(node!=null){
            int r=height(node.right);
            int l=height(node.left);
            if(r>l){
                return 1+r;
            }
            else{
                return 1+l;
            }
        }
        else{
            return 0;
        }
    }
}
