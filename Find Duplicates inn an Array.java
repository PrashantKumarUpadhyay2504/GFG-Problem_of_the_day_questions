class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        int[] cntfr=new int[100000+1];
        for(int i=0;i<arr.length;i++){
            cntfr[arr[i]]++;
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<100001;i++){
            if(cntfr[i]>1) ans.add(i);
        }
        if(ans.isEmpty()){
            ans.add(-1);
            return ans;
        }
        return ans;
    }
}
