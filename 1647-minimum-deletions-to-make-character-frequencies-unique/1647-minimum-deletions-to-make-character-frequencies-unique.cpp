class Solution {
public:
    int minDeletions(string s) {
            int fre[26] = {}, res = 0;
    for (char ch : s)
        ++fre[ch - 'a'];
    sort(begin(fre), end(fre));
    for (int i = 24; i >= 0 && fre[i] > 0; --i) 
    {
        if(fre[i]>=fre[i+1])
        {
            res+=(fre[i]-max(0,fre[i+1]-1));
            fre[i]=max(0,fre[i+1]-1);
        }
    }
    return res;
    }
};