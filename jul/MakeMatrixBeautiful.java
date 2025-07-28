package jul;

public class MakeMatrixBeautiful {
        public static int balanceSums(int[][] mat) {
        int n = mat.length;
        int[] rowSum = new int[n];
        int[] colSum = new int[n];
        int maxSum = Integer.MIN_VALUE;

        // Step 1: Calculate row sums and column sums
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rowSum[i] += mat[i][j];
                colSum[j] += mat[i][j];
            }
        }

        // Step 2: Find maximum row or column sum
        for (int i = 0; i < n; i++) {
            maxSum = Math.max(maxSum, Math.max(rowSum[i], colSum[i]));
        }

        // Step 3: Total operations needed = sum of (maxSum - rowSum[i])
        int operations = 0;
        for (int i = 0; i < n; i++) {
            operations += (maxSum - rowSum[i]);
        }

        return operations;
    }

    public static void main(String[] args) {
      
    }
      
}
