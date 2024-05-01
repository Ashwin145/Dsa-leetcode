//boyer moore majority vote algorithm
class Solution {
    public int majorityElement(int[] nums) {
        int winner = nums[0],lead = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==winner){
                lead++;
            }else if(lead>0){
                lead--;
            }else{
                winner = nums[i];
                lead=1;
            }
        }
        return winner;

        
    }
}
//lect -6(Part-3)