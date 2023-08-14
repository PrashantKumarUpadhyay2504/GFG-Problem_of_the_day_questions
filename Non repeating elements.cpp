class Solution
{
public:
    vector<int> singleNumber(vector<int> nums) 
    {
        // Code here.
         unordered_map<int,int>hash;
        vector<int>ans;
        for(int i=0;i<nums.size();i++)
        {
            hash[nums[i]]++;
        }
        for(auto x:hash)
        {
            if(x.second==1)
            {
                ans.push_back(x.first);
                sort(ans.begin(),ans.end());
            }
        }
        return ans;
    }
};
