class Solution {
    int minimumMultiplications(int[] arr, int start, int end) {

        // Your code here
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
       // HashMap<Integer, Integer> map = new HashMap<>();
        
        int currSteps = 0;
        map.put(start, currSteps);
        while(!map.isEmpty()){
            int num = map.keySet().iterator().next();
           
            currSteps = map.get(num);
            map.remove(num);
            for(int i=0; i<arr.length; i++){
                int mul = (num*arr[i])%100000;
                
                if(mul == end){
                    return currSteps+1;
                }
                if(!map.containsKey(mul)){
                    map.put(mul, currSteps+1);
                   
                
                }
            }
        }
 
        return -1;
        
    }
}
