class Solution {
public:
    int maxScore(string s) {
         int maxScore = 0;
        int zerosLeft = 0, onesRight = 0;

        // Count the total number of '1's to the right of the split
        for (char c : s) {
            if (c == '1') {
                onesRight++;
            }
        }

        // Iterate through the string except for the last character
        for (int i = 0; i < s.length() - 1; i++) {
            // Update counts based on the current character
            if (s[i] == '0') {
                zerosLeft++;
            } else {
                onesRight--;
            }
            // Update maxScore with the maximum count of zerosLeft + onesRight encountered so far
            maxScore = max(maxScore, zerosLeft + onesRight);
        }

        return maxScore;
    }
};