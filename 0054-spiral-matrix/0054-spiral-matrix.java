import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length - 1;
        int endcol = matrix[0].length - 1;
        
        while (startrow <= endrow && startcol <= endcol) {
            // Traverse top
            for (int j = startcol; j <= endcol; j++) {
                result.add(matrix[startrow][j]);
            }
            // Traverse right
            for (int i = startrow + 1; i <= endrow; i++) {
                result.add(matrix[i][endcol]);
            }
            // Traverse bottom
            for (int j = endcol - 1; j >= startcol && startrow != endrow; j--) {
                result.add(matrix[endrow][j]);
            }
            // Traverse left
            for (int i = endrow - 1; i > startrow && startcol != endcol; i--) {
                result.add(matrix[i][startcol]);
            }
            
            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        Solution solution = new Solution();
        List<Integer> spiral = solution.spiralOrder(matrix);
        System.out.println(spiral);
    }
}
