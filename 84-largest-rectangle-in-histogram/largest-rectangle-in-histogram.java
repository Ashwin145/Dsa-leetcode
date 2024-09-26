class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] nsl = new int[n]; // Next Smaller to the Left
        int[] nsr = new int[n]; // Next Smaller to the Right

        Stack<Integer> s = new Stack<>();

        // Calculate NSL (Next Smaller Left)
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1; // If no smaller element, mark -1
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        s = new Stack<>(); // Clear the stack

        // Calculate NSR (Next Smaller Right)
        for (int i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = n; // If no smaller element, mark 'n' (out of bounds)
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // Calculate the max area for each bar
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int height = heights[i];
            int width = nsr[i] - nsl[i] - 1; // Width of the rectangle
            int currArea = height * width; // Area = height * width
            maxArea = Math.max(maxArea, currArea); // Update the maximum area
        }

        return maxArea;
    }
}
