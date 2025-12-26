package Dec;

import java.util.ArrayList;

public class findAmiddleelement {

      public ArrayList<Integer> findPeakGrid(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;

        int low = 0, high = cols - 1;

        while (low <= high) {
            int midCol = (low + high) / 2;

            // find max row in mid column
            int maxRow = 0;
            for (int i = 0; i < rows; i++) {
                if (arr[i][midCol] > arr[maxRow][midCol]) {
                    maxRow = i;
                }
            }

            int left  = midCol - 1 >= 0 ? arr[maxRow][midCol - 1] : -1;
            int right = midCol + 1 < cols ? arr[maxRow][midCol + 1] : -1;

            if (arr[maxRow][midCol] > left && arr[maxRow][midCol] > right) {
                ArrayList<Integer> ans = new ArrayList<>();
                ans.add(maxRow);
                ans.add(midCol);
                return ans;
            } 
            else if (right > arr[maxRow][midCol]) {
                low = midCol + 1;
            } 
            else {
                high = midCol - 1;
            }
        }

        return new ArrayList<>(); // never reached ideally
    }
      public static void main(String[] args) {
            
      }
}
