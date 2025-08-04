package Aug;

public class SubMatrixGenerator {

    public static void printAllSubmatrices(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {         // top row
            for (int j = 0; j < cols; j++) {     // left column
                for (int k = i; k < rows; k++) { // bottom row
                    for (int l = j; l < cols; l++) { // right column

                        System.out.println("Submatrix from (" + i + "," + j + ") to (" + k + "," + l + "):");

                        for (int x = i; x <= k; x++) {
                            for (int y = j; y <= l; y++) {
                                System.out.print(matrix[x][y] + " ");
                            }
                            System.out.println();
                        }

                        System.out.println("------");
                    }
                }
            }
        }
    }


    // Kadane’s Algorithm ek efficient algorithm hai jo maximum subarray sum find karta hai — especially useful for contiguous subarrays in an array that contains both positive and negative numbers 

    private int kadane(int[] arr) {
        int maxEndingHere = arr[0];
        int maxSoFar = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2},
            {3, 4}
        };

        printAllSubmatrices(matrix);
    }
}
