class Solution {
    static class Pair{
        int sum, x, y;
        Pair(int s, int r, int c) {
            this.sum = s;
            this.x = r;
            this.y = c;
        }
    }
    static List<Integer> maxCombinations(int n, int k, int a[], int b[]) {
        // code here
        Arrays.sort(a);
        Arrays.sort(b);
        PriorityQueue<Pair> pq = new PriorityQueue<>((Pair p1, Pair p2) -> p2.sum - p1.sum) ;
        for(int i = n - 1; i >= 0; i--)
            pq.add(new Pair(a[i] + b[n - 1], i, n - 1));
            
        List<Integer> l = new ArrayList<>();
        while(--k > 0) {
            Pair p = pq.peek();
            pq.poll();
            
            int x = p.x, y = p.y, sum = p.sum;
            l.add(sum);
        
            pq.add(new Pair(a[x] + b[y - 1], x, y - 1));
        }
        
        l.add(pq.peek().sum);
        return l;
    }
}
