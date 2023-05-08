class Solution {
public:
    int diagonalSum(vector<vector<int>>& mat) {
        int sum=0;
        int start=0;
        int end=mat.size()-1;
        for(int i=0;i<mat.size();i++){
            if(start==end) sum-=mat[start][end];
            sum+=mat[i][start]+mat[i][end];
            start++;
            end--;
        }
        
        return sum;
    }
};