#include <iostream>
#include <vector>

using namespace std;

class commonChar
{
public:
    vector<string> commonC(vector<string>& words){
        vector<int> val1(26,0);
        vector<int> val2(26,0);

        for(auto ch : words[0]){
            val1 [ch -'a']++;
        }

        for(int i=1;i<words.size();i++){
            for (auto ch : words[i]){
                val2[ch-'a']++;
            }
            for (int i = 0; i < 26; i++)
            {
                val1[i] = min(val1[i],val2[i]);
                val2[i] = 0;
            }
        }
        vector<string> ans;
        for (int i = 0; i < 26; i++)
        {
            if(val1[i] >0){
                int count = val1[i];
                while(count--){
                    char x = i+ 'a';
                    string s;
                    s =x;
                    ans.push_back(s);
                }
            }
        }
        return ans;
    }
    
};




