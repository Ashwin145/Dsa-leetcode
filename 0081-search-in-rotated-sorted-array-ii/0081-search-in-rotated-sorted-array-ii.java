class Solution {
    public boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = (start +(end-start)/2);
            if(nums[mid] == target)return true;
            //if left half is sorted 
            if(nums[mid]>nums[start]){
                if(target<nums[mid] && target>=nums[start]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
                //if right half is sorted 

            }else if( nums[mid]<nums[start]){
                if(target>nums[mid] && target<nums[start]){
                    start = mid+1;
                }else{
                    end=mid-1;

                }

            }else{
                //when we are not sure on which half the values are present
               // nums[start] == nums[mid] == nums[end]
                start++;
            }
        }
        return false;
    }
}