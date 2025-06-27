import java.util.Arrays;

public class Mobilenumrerickeypad {


  private static int solve(int[][] keyPad, int i, int j, int n, int[][][] dp) {
        if (i < 0 || j < 0 || i >= 4 || j >= 3 || keyPad[i][j] == -1) return 0;
        if (n == 1) return 1;

        if (dp[i][j][n] != -1) return dp[i][j][n];

        int self = solve(keyPad, i, j, n - 1, dp);
        int left = solve(keyPad, i, j - 1, n - 1, dp);
        int right = solve(keyPad, i, j + 1, n - 1, dp);
        int up = solve(keyPad, i - 1, j, n - 1, dp);
        int down = solve(keyPad, i + 1, j, n - 1, dp);

        return dp[i][j][n] = self + left + right + up + down;
    }

    // Main function to get count of n-digit numbers
    public static int getCount(int n) {
        int[][] keyPad = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {-1, 0, -1}
        };

        int[][][] dp = new int[4][3][n + 1];
        for (int[][] row : dp)
            for (int[] col : row)
                Arrays.fill(col, -1);

        int ans = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if (keyPad[i][j] != -1) {
                    ans += solve(keyPad, i, j, n, dp);
                }
            }
        }

        return ans;
    }
      public static void main(String[] args) {
            
      }
}
