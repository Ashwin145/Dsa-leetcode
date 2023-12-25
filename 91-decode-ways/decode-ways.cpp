class Solution {
public:
    int bottom_up_1(string&s, int n) {
        //simply simulate the memoized version
        vector<int> t(n+1, 0);
        //t[i] = ways to decode string from index i to n
        t[n] = 1;
        
        for(int i = n-1; i>=0; i--) {
            if(s[i] == '0')
                t[i] = 0;
            else {
                t[i] = t[i+1];
                if(i < n-1 && (s[i] == '1' || (s[i] == '2' && s[i+1] < '7')))
                    t[i] += t[i+2];
            }
        }
        return t[0];
    }
    
    int numDecodings(string &s) {
        int n = s.length();
        vector<int> t(n+1, -1);
        return bottom_up_1(s, n);
    }
};