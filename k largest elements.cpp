class Solution{
public:  
vector<int> kLargest(int arr[], int n, int k) {
        sort(arr,arr+n) ;
        vector<int> ans ;
        int i = n-1 , cnt = 0 ;
        while(cnt++<k)
            ans.push_back(arr[i--]);
        return ans ;
    }

};
