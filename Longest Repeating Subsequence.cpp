class Solution {
	public:
		int LongestRepeatingSubsequence(string str){
		    // Code here
        int n = str.length(); // Store the length of the input string.
        string s = str; // Create a copy of the input string to work with.

        int t[n+1][n+1]; // Create a two-dimensional array 't' with size (n+1) x (n+1).

        // Initialize the first row and column of 't' with zeros.
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    t[i][j] = 0;
            }
        }

        // Fill in the 't' array using dynamic programming.
        // This loop will compare characters of 'str' and 's' to find the longest repeating subsequence.
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // If the characters at positions 'i' and 'j' are the same, and the positions are different (i!=j),
                // then we have found another repeating character in the subsequence.
                if (str[i - 1] == s[j - 1] && i != j)
                    t[i][j] = 1 + t[i - 1][j - 1]; // Increase the count and continue to find the next pair.
                else
                    t[i][j] = max(t[i - 1][j], t[i][j - 1]); // Otherwise, take the maximum length so far.
            }
        }

        // The value at t[n][n] will represent the length of the longest repeating subsequence in the string.
        return t[n][n];
		}

};
