package FEB.GFGPOD;

import java.util.Arrays;

public class FEB_06_POD {
      public static int[] smallestDiff(int a[], int b[], int c[]) {
            // write code here
           int n = a.length;
            int m = b.length;
            int o = c.length;
            Arrays.sort(a);
            Arrays.sort(b);
            Arrays.sort(c);

         int i = 0, j = 0, k = 0;
        int minDiff = Integer.MAX_VALUE;
        int minSum = Integer.MAX_VALUE;
        int[] result = new int[3];


            while (i < n && j < m && k < o) {
                  int max = Math.max(a[i], Math.max(b[j], c[k]));
                  int min = Math.min(a[i], Math.min(b[j], c[k]));
                  int diff = max - min;
                     int sum = a[i] + b[j] + c[k];
                 
            if (diff < minDiff || (diff == minDiff && sum < minSum)) {
                minDiff = diff;
                minSum = sum;
                result[0] = a[i];
                result[1] = b[j];
                result[2] = c[k];
            }




                     if (a[i] == min) i++;
            else if (b[j] == min) j++;
            else k++;
        }
            
           Arrays.sort(result);
        return new int[]{result[2], result[1], result[0]};
      }

      public static void main(String[] args) {
            int[] a = { 5, 2, 8 };
            int[] b = { 10, 7, 12 };
            int[] c = { 9, 6, 3 };

            int[] res = smallestDiff(a, b, c);
            for (int i : res) {
                  System.out.print(i + " ");
            }
      }
}
