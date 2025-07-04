package jul;

import java.util.HashMap;
import java.util.Map;

public class LongestsubarryawithAlmosttwoDistinctIntegers {
       public static int totalElements(int[] arr) {
        // code here
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < arr.length; right++) {
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);

            // Shrink window if more than 2 distinct numbers
            while (map.size() > 2) {
                map.put(arr[left], map.get(arr[left]) - 1);
                if (map.get(arr[left]) == 0) {
                    map.remove(arr[left]);
                }
                left++;
            }

            // Update max length
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
      public static void main(String[] args) {
            
      }
}
