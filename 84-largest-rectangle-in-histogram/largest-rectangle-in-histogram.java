class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        int[] nsl = new int[heights.length]; // Next Smaller Left
        int[] nsr = new int[heights.length]; // Next Smaller Right
        
        // Stack for calculating Next Smaller Right
        Stack<Integer> s = new Stack<>();
        for (int i = heights.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = heights.length; // If no smaller element on right, set to heights.length
            } else {
                nsr[i] = s.peek(); // Otherwise, next smaller element to the right
            }
            s.push(i); // Push current index onto the stack
        }
        
        // Stack for calculating Next Smaller Left
        s = new Stack<>();
        for (int i = 0; i < heights.length; i++) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1; // If no smaller element on left, set to -1
            } else {
                nsl[i] = s.peek(); // Otherwise, next smaller element to the left
            }
            s.push(i); // Push current index onto the stack
        }
        
        // Calculate max area
        for (int i = 0; i < heights.length; i++) {
            int height = heights[i];
            int width = nsr[i] - nsl[i] - 1; // Calculate width of the rectangle
            int currArea = height * width;
            maxArea = Math.max(currArea, maxArea); // Update maxArea
        }
        
        return maxArea; // Return the largest area
    }
}
