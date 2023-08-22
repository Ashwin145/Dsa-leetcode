class Solution {
public:
    string convertToTitle(int columnNumber) {
        string ans="";
        while(columnNumber>0){
            columnNumber--;
            int rem=columnNumber % 26;
            columnNumber = columnNumber/26;
            ans.push_back(rem + 'A');
        }
        reverse(ans.begin(),ans.end());
        return ans;
            
        
    }   
};