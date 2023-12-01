public static boolean solve(Node root , int min , int max){
        
        if(root == null) return false;
        
        if(min == max) return true;
        
        boolean left = solve(root.left , min , root.data - 1);
        boolean right = solve(root.right , root.data + 1 , max);
        
        return left || right;
