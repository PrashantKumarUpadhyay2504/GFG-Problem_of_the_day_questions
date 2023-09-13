
class Solution{
    static String findLargest(int N, int S){
        // code here
        if(N==1 && S>9 || N>1 && S==0){
            return "-1";
        } 
        if((9*N)<S){
            return "-1";
        }
        String s="";
        while(N>0){
            if(S>9){
                 s=s+"9"; 
                 S-=9;
            }
            else{ 
                s=s + Integer.toString(S);
                S=0;
            }
            N--;
        }
       
        return s;
    }
}
