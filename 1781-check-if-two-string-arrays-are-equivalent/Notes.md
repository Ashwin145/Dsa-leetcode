<h2>check-if-two-string-arrays-are-equivalent Notes</h2><hr>class Solution{
    public boolean arrayStringsAreEqual(String[] word1,String[] word2){
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        //Concatenate strings from word1 array into str1
        for (String s : word1){
            str1.append(s);
        }
        //Concatenate strings from word1 array into str1
        for (String s : word2){
            str2.append(s);
        }
        //Compare the concatenated strings
        return str1.toString().equals(str2.toString());


    }
    public static void main(String[] args){
        String[] word1 ={"ab", "c"};
        String[] word2 = {"a", "bc"};
        Solution solution = new Solution();// Instantiate the Solution class
        boolean result = solution.arrayStringsAreEqual(word1,word2);
        System.out.println("Do the arrays represent the same string?" + result);
        

    }
}