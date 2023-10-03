class Solution
{
    String colName (long n)
    {
        // your code here
        StringBuilder sb = new StringBuilder();
        int i = 1;
        while (n > 0) {
            long num = n % 26;
            if (num == 0) {
                num = 26;
                n--;
            }
            n = n / 26;
            sb.append((char)(65+num-1));
        }
        return sb.reverse().toString();
    }
}
