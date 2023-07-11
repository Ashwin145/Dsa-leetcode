class Solution {
public:
    string customSortString(string order, string s) {
        string s1,s2;
        int a[26] = {0};
        for(char c:order) a[c-'a']++;
        for(char c: s){
            if(a[c-'a']==0) s2+=c;
            else a[c-'a']++;
        }
        for(char c: order){
            while(a[c-'a']>1){
                s1+=c;
                a[c-'a']--;

            }
        }
        return s1+s2;
        

    }
};