class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int leftproduct =1;
        int rightproduct = 1;
        int ans = nums[0];

        for(int i=0;i<n;i++){
            //if any of leftproduct or rightproduct bocomes 0 then update it to 1
            leftproduct = leftproduct == 0 ? 1 : leftproduct;
            rightproduct = rightproduct == 0 ? 1 : rightproduct;

            //prefix product
            leftproduct = leftproduct*nums[i];

            //suffix
            rightproduct = rightproduct*nums[n-1-i];

            ans = Math.max(ans,Math.max(leftproduct,rightproduct));


        }
        return ans;
        
    }
}
//NL