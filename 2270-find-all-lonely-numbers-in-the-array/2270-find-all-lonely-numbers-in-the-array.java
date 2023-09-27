class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        HashMap<Integer,Integer>hm =new HashMap<Integer,Integer>();
        for(int i = 0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else{
                hm.put(nums[i],1);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(hm.get(nums[i])==1 && !hm.containsKey(nums[i]+1) && !hm.containsKey(nums[i]-1)){
                result.add(nums[i]);
            }
        }
        return result;
    }
}