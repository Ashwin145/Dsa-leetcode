class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String strs1 = strs[0];
        String strs2 = strs[strs.length-1];
        int index = 0;
        while(index<strs1.length()){
            if(strs1.charAt(index) == strs2.charAt(index)){
                index++;
            }else{
                break;
            }
            
        }
        return index==0?"":strs1.substring(0,index);



        
    }
}