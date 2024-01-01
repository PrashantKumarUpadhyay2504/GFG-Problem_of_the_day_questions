class Solution {
    public boolean canPair(int[] nums, int k) {
        // Code here
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int cur=nums[i]%k;
            int need=(k-cur)%k;
            if(map.containsKey(need)){
                int x=map.get(need);
                x--;
                if(x==0){
                    map.remove(need);
                }
                else{
                    map.put(need,x);
                }
            }
            else{
                map.put(cur,1);
            }
        }
        if(map.isEmpty()){
            return true;
        }
        return false;
    }
}
