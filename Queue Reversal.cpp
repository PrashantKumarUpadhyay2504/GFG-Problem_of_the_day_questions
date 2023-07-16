class Solution
{
    public:
    void reverse(queue<int>& q)
    {
        if(q.size()==0)
        return;
        int temp=q.front();
        q.pop();
        reverse(q);
        q.push(temp);
    }
    queue<int> rev(queue<int> q)
    {
        // add code here.
        reverse(q);
        return q;
    }
};
