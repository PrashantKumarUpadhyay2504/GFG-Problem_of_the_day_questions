class Solution
{
    public static ArrayList<Integer> repeatedRows(int matrix[][], int m, int n)
    {
        //code here
        ArrayList<Integer> ans = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; i < matrix.length; i++) {
            if (!set.add(Arrays.hashCode(matrix[i]))) {
                ans.add(i);
            }
        }
        
        return ans;
    }
}
