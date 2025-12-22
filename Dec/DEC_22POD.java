package Dec;

public class DEC_22POD {


       public static int rowWithMax1s(int arr[][]) {

        int m = arr.length;
        int n = arr[0].length;

        int maxCount = 0;
        int rowIndex = -1;

        for (int i = 0; i < m; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                rowIndex = i;
            }
        }

        return rowIndex;
    }

      public static void main(String[] args) {
            int[][]arr = {
                  {0,1,1,1},
             {0,0,1,1}, 
             {1,1,1,1}, 
             {0,0,0,0}
            };
      }
}
