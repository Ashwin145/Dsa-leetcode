class Solution {
public:
    vector<int> maxSlidingWindow(vector<int>& nums, int k) {
        int n = nums.size();
        deque<int>deq;
        vector<int>result;
        for(int i=0;i<n;i++){
            //make space for nums[i]
            //<=i-k
            while(!deq.empty() && deq.front()<=i-k){
                deq.pop_front();
            }
            //step-2
            while(!deq.empty() && nums[i]>nums[deq.back()]){
                deq.pop_back();
            }
            //step-3
            deq.push_back(i);

            //step--4
            if(i>=k-1){
                result.push_back(nums[deq.front()]);
            }
        }
        return result;
        
    }
};