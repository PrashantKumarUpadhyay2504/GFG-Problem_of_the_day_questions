 int y;
    public List<Integer> pattern(int N){
        y=N;
       if(N>0) recurse(N+5);
       else System.out.print(N);
        return new LinkedList<Integer>();
    }
    void recurse(int n){
        if(n>0){
            System.out.print(n-5+" ");
            recurse(n-5);
           if(n<=y) System.out.print(n+" ");
        }
