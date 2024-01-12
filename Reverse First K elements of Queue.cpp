// User function Template for C++

class Solution
{
    public:
    
    // Function to reverse first k elements of a queue.
    queue<int> modifyQueue(queue<int> q, int k) {
        // add code here.
         stack<int> s;
        queue<int> qu;
        int l=q.size();
        for(int i=0;i<k;++i)
        {
        s.push(q.front());
        q.pop();
        }
        for(int i=0;i<k;++i)
        {
        qu.push(s.top());
        s.pop();
        }
        for(int i=k;i<l;++i)
        {
        qu.push(q.front());
        q.pop();
        }
        return qu;
    }
};
