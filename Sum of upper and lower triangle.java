class Solution
{
    //Function to return sum of upper and lower triangles of a matrix.
    static ArrayList<Integer> sumTriangles(int matrix[][], int n)
    {
        // code here
        int upperSum = 0;
        int lowerSum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i <= j) {
                    upperSum += matrix[i][j]; // Upper triangle
                }
                if (i >= j) {
                    lowerSum += matrix[i][j]; // Lower triangle
                }
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(upperSum);
        result.add(lowerSum);

        return result;
    }
}
