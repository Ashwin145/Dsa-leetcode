class Solution {
    public void reverseString(char[] s) {
        int right=s.length-1;
        int left = 0;
        while(left<right){
            char c = s[left];
            s[left] = s[right];
            s[right] = c;
            left++;
            right--;
        }

       
        
    }
}