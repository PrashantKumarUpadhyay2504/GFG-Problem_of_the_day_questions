class Solution {
  public:
  long long maxDiamonds(int a[], int n, int k) {
        long long count =0;
        priority_queue<long long>temp;
        for(int i=0;i<n;i++)
        {
            temp.push(a[i]);
        }
        
        for(int i=0;i<k;i++)
        {
            count=count+temp.top();
            int ele=temp.top()/2;
            temp.pop();
            temp.push(ele);
        }
        
        return count;
    }


};
