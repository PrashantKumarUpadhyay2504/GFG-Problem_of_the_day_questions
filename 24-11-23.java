static final long MOD = 1000000007; 
    ArrayList<Long> nthRowOfPascalTriangle(int n) {
        // code here
        
        ArrayList<Long> currentRow = new ArrayList<>();
        currentRow.add(1L); // First element is always 1

        // Generating rows one by one up to the nth row
        for (int i = 1; i < n; i++) {
            ArrayList<Long> nextRow = new ArrayList<>();
            nextRow.add(1L); // First element of each row is 1

            // Calculate each value for the next row except the first and last element
            for (int j = 1; j < i; j++) {
                long newValue = (currentRow.get(j - 1) + currentRow.get(j)) % MOD;
                nextRow.add(newValue);
            }

            nextRow.add(1L); // Last element of each row is 1
            currentRow = nextRow; // Update current row to the next row for the next iteration
        }

        return currentRow;
