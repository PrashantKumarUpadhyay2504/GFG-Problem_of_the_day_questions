ArrayList<Integer> sum = new ArrayList<Integer>();
        
        for(int i = 0; i<q; i++){
            
            if(queries[i][0] == 1){
                query1(mat, queries[i][1], queries[i][2], sum);
            }else{
                 query2(mat, queries[i][1], queries[i][2], sum);
            }
        }
        return sum;
    }
    static void query2(int[][] mat, int i, int j, ArrayList<Integer> sum){
        int[] row = { -2, -2, -2, -2, -2, -1, 0, 1, 2, 2, 2, 2, 2, 1, 0, -1 };
int[] col = { -2, -1, 0, 1, 2, 2, 2, 2, 2, 1, 0, -1, -2, -2, -2, -2 };
 
int s = 0;
 
int n = mat.length;
int m = mat[0].length;
 
for (int k = 0; k < 16; k++) {
int nr = row[k] + i;
int nc = col[k] + j;
if (nr >= 0 && nr < n && nc >= 0 && nc < m) {
s += mat[nr][nc];
}
}
 
sum.add(s);
return;
    }
    static void query1(int[][] mat, int i, int j, ArrayList<Integer> sum){
        int[] row = { -1, -1, -1, 0, 1, 1, 1, 0 };
int[] col = { -1, 0, 1, 1, 1, 0, -1, -1 };
 
int s = 0;
 
int n = mat.length;
int m = mat[0].length;
 
for (int k = 0; k < 8; k++) {
int nr = row[k] + i;
int nc = col[k] + j;
if (nr >= 0 && nr < n && nc >= 0 && nc < m) {
s += mat[nr][nc];
}
}
sum.add(s);
return;
