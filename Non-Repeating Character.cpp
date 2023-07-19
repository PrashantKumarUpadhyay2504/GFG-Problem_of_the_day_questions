vector<int> mp(26,0);
       int n= s.length();
      for(int i = 0 ; i<n ;i++)
      {
          mp[s[i]-'a']++;
      }
      for(int i = 0 ; i<n ;i++)
      {
          if(mp[s[i]-'a']==1)
            return s[i];
      }
      
      return '$';
