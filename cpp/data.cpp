#include <iostream>

using namespace std;

int main()
{
    int n;
    int m;
    cin >> n >> m;
    if(n>m) cout << "greater";
    else if(n<m) cout<< "lesser";
    else cout<< "equals";
    return 0;
}
