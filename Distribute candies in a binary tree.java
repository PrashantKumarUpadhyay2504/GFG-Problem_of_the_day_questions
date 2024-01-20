class Solution
{
       int rahee = 0;
    public  int distributeCandy(Node root)
    {
        //code here
     
        gg(root);
        return rahee;
    }
    public  int gg(Node root)
    {
        if(root == null) 
        {
            return 0;
        }
        
        int left = gg(root.left);
        int right = gg(root.right);
        rahee += Math.abs(left) + Math.abs(right);
        return root.data + left + right - 1;
    }
}
