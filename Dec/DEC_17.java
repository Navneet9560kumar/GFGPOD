package Dec;

import java.util.ArrayList;
import java.util.Arrays;

public class DEC_17 {

       public ArrayList<int[]> mergeOverlap(int[][] arr) {
        // Final merged intervals store karne ke liye list
        ArrayList<int[]> result = new ArrayList<>();

        // Agar array empty ya null hai to empty list return kar do
        if (arr == null || arr.length == 0)
            return result;

        // Step 1: Intervals ko start time ke according sort karo
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        // Step 2: Pehla interval base maan lo
        int start = arr[0][0];
        int end = arr[0][1];

        // Step 3: Baaki intervals ke saath compare karo
        for (int i = 1; i < arr.length; i++) {

            // Agar current interval overlap kar raha hai
            if (arr[i][0] <= end) {
                // End ko update kar do (max le lo)
                end = Math.max(end, arr[i][1]);
            } else {
                // Overlap nahi hai, to purana interval result me daal do
                result.add(new int[]{start, end});

                // Naya interval start karo
                start = arr[i][0];
                end = arr[i][1];
            }
        }

        // Last interval ko bhi result me add karna mat bhoolna
        result.add(new int[]{start, end});

        return result;
    }


      public static void main(String[] args) {
            
      }
}
