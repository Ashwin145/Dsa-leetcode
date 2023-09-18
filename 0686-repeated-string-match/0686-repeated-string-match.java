class Solution {
    public int repeatedStringMatch(String a, String b) {
        String strA = a;
        int repeat = b.length()/a.length();
        int count = 1;
        for(int i = 0;i<repeat+2;i++){
            if(a.contains(b))
             return count;

            else{
                a += strA;
                count++; 
            } 
        }
        return -1;
        
    }
}