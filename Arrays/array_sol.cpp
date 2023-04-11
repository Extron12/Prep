#include <iostream>
#include <iterator>
#include <vector>
using namespace std;

class Array{
public:
    vector<int> buildArray(vector<int>& nums) {
        
        vector<int> ans;
        int n = nums.size();
        for (int i = 0; i < n; i++)
        {
            ans.push_back(nums[nums[i]]);
        }
        return ans;
        
    
}
int main(){
    vector<int> arr = {5,0,1,2,3,4};
    vector<int> sol = buildArray(arr);
    copy(sol.begin(),sol.end(),ostream_iterator<int>(cout," "));


};
};