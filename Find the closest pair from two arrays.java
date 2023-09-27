class Solution{
    // Function for finding maximum and value pair
    public static ArrayList<Integer> printClosest (int arr[], int brr[], int n, int m, int x) {
        // code here
        int i = 0, j = m - 1;
        int diff = Integer.MAX_VALUE;
        int a = -1, b = -1;

        while (i < n && j >= 0) {
            if (Math.abs(arr[i] + brr[j] - x) < diff) {
                diff = Math.abs(arr[i] + brr[j] - x);
                a = arr[i];
                b = brr[j];
            }

            if (arr[i] + brr[j] > x) {
                j--;
            } else {
                i++;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(a);
        result.add(b);
        return result;
    }
}
