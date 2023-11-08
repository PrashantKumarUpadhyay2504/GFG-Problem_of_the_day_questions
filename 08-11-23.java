 ArrayList<Integer> list=new ArrayList();
        int n=mat.length;
        int i=0;
        while(i<n){
            for(int j=0;j<n;j++){
                list.add(mat[i][j]);
            }
            i++;
            if(i==n){
                break;
            }
            for(int j=n-1;j>=0;j--){
                list.add(mat[i][j]);
            }
            i++;
        }
        return list;
