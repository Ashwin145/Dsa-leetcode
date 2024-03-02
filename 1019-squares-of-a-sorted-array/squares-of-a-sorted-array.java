class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            nums[i] = nums[i]*nums[i];
        }
        int head  = 0;
        int tail = nums.length-1;

        for(int pos = nums.length-1;pos>=0;pos--){
            if(nums[head]>nums[tail]){
                res[pos] = nums[head];
                head++;
            }else{
                res[pos] = nums[tail];
                tail--;
            }
        }
        return res;
        
    }
}//lohia