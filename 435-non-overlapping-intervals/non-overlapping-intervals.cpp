class Solution {
public:
    int eraseOverlapIntervals(vector<vector<int>>& intervals) {
        sort(intervals.begin(),intervals.end());
        int previous = 0;
        int n = intervals.size();
        int ans = 0;
        for(int current = 1;current<n; current++){
            //[1,5] [3,6]//overlapping


            //[1,5][8,10]//non overlapping
            if(intervals[current][0]<intervals[previous][1]){
                ans++;
                if(intervals[current][1]<=intervals[previous][1])
                previous = current;
            }
            //  [1,5]   [8,11]  [13,67]
              //previous = current;
            else{
                previous = current;

            }

        }
        return ans;

        
    }
};