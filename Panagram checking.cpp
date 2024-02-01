//User function template for C++

class Solution
{
  public:
    //Function to check if a string is Pangram or not.
    bool checkPangram (string s) {
        // your code here
            int arr[26]={0};
        for(int i=0;i<s.size();i++){
            if(s[i]>='A' && s[i]<='Z'){
                arr[s[i]-'A']++;
            }
            if(s[i]>='a' && s[i]<='z'){
                arr[s[i]-'a']++;
            }
        }
        for(int i=0;i<26;i++){
            if(arr[i]==0){
                return 0;
            }
        }
        return 1;
    }

};
