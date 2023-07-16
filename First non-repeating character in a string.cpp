class Solution {
	public:
		string FirstNonRepeating(string A){
		    // Code here
		    vector<int>temp(26,-1);
		  string res="";
		  for (int i=0;i<A.size();i++)
		  {
		      int ind=A[i]-'a';
		      if (temp[ind]==-1) temp[ind]=i;
		      else temp[ind]=-2;
		       int ans=1e7;
		       for (int i=0;i<26;i++)
		       {
		           if (temp[i]>=0)
		           {
		               ans=min(ans,temp[i]);
		           }
		       }
		       if (ans!=1e7)
		       res+=A[ans];
		       else res+="#";
		  }
		  return res;
		}

};
