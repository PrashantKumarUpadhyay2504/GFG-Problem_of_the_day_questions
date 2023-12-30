class Solution
{
    //Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n)
    {
        // add your code
        String [] result = new String[2]; 
        Map<String,Integer> hm = new HashMap<>();
        for(String i : arr){
            if(hm.containsKey(i)){
                hm.put(i,hm.get(i)+1);
            }else{
                hm.put(i,1);
            }
        }
        String w = "zzzzzzzzzzzz";
        int max = -1;
        for(String i : hm.keySet()){
            if(hm.get(i)>max){
                w = i;
                max = hm.get(i);
            }else if(hm.get(i)==max){
                w = lf(i,w);
            }
        }
        result[0]=w;
        result[1]=max+"";
        
        return result;
    }
    
    private static String lf(String s1,String s2){
        if(s1.compareTo(s2)<0) return s1;
        return s2;
    }
}

