
class Solution
{
    //Function to modify the matrix such that if a matrix cell matrix[i][j]
    //is 1 then all the cells in its ith row and jth column will become 1.
    void booleanMatrix(int a[][])
    {
        // code here 
    HashSet<Integer> r=new HashSet<>();
    HashSet<Integer> c=new HashSet<>();
    for(int i=0;i<a.length;i++){
        for(int j=0;j<a[0].length;j++){
            if(a[i][j]==1){
                r.add(i);
                c.add(j);
            }
        }
    }
  
    for(int i:r){
        for(int k=0;k<a[0].length;k++){
        if(a[i][k]==1){
           
            continue;
        }
        a[i][k]=1;}
    }
   
    for(int i:c){
        for(int k=0;k<a.length;k++){
        if(a[k][i]==1){
           
            continue;
        }
        a[k][i]=1;
            
        
    }
}
}
}
