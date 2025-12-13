package Dec;

public class Dec_13POD {

      public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void swapDiagonal(int[][] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            swap(arr[i], i, n - 1 - i);
        }
    }

       
      public static void main(String[] args) {
           
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
      }
}
