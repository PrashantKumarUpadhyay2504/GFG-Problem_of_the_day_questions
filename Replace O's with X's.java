class pair{
    int i,j;
    pair(int a,int b){
        i=a;
        j=b;
    }
}
class Solution{
    static char[][] fill(int n, int m, char a[][])
    {
        // code here
        boolean[][] vis=new boolean[n][m];
        Stack<pair> st=new Stack<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 || i==n-1 || j==0 || j==m-1){
                    if(a[i][j]=='O'){
                        st.add(new pair(i,j)); 
                        vis[i][j]=true;
                    }
                }
            }
        }
        int[] dr={-1,0,1,0};
        int[] dc={0,1,0,-1};
        while(!st.isEmpty()){
            pair p=st.pop();
            int r=p.i;
            int c=p.j;
            for(int k=0;k<4;k++){
                int nr=r+dr[k];
                int nc=c+dc[k];
                if(nr<n && nr>=0 && nc<m && nc>=0 && !vis[nr][nc] && a[nr][nc]=='O'){
                    st.add(new pair(nr,nc));
                    vis[nr][nc]=true;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i][j]=='O' && !vis[i][j]){
                    a[i][j]='X';
                }
            }
        }
        return a;
    }
} 
