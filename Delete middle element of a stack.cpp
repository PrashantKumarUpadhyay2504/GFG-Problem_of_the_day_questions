class Solution
{
    public:
    //Function to delete middle element of a stack.
    void deleteMid(stack<int>&s, int sizeOfStack)
    {
        // code here.. 
        int k=sizeOfStack/2;
        vector<int> ans;
        while(k!=0){
            int f=s.top();
            ans.push_back(f);
            s.pop();
            k--;
        }
        s.pop();
        for(int i=ans.size()-1;i>=0;i--){
            s.push(ans[i]);
        }
    }
};
