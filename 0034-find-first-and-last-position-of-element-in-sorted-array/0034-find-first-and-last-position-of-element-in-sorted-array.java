class Solution {
    public static void main(String[] args){
        int nums[] = {5,7,7,8,8,10};
        int target = 8;
        
        int[] result = searchRange(nums, target); // Calling the method directly, no need to create an instance
        System.out.println(result[0] + " " + result[1]);
    }
    public static int[] searchRange(int [] nums, int target) {
        int[] arr = new int[2];
        arr[0]=arr[1]=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                 arr[0] = i;
                 while(i<nums.length-1 && nums[i+1] == target){
                    i++;
                
                }
                arr[1] = i;
                break;
            }
        }
        return arr;


        
    }
}