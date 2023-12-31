class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n > 0) {
            String binary = Integer.toBinaryString(n);
            return binary.lastIndexOf("1") == 0;
        }
        return false; // Return false if n is not greater than 0
    }
}
