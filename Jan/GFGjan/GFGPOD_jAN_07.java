package Jan.GFGjan;

import java.util.*;

public class GFGPOD_jAN_07 {

      // ArrayList<Integer> countDistinct(int arr[], int k) {
      //       // code here
      //       int n = arr.length;

      //       ArrayList<Integer> result = new ArrayList<>();

      //       for (int i = 0; i <= n - k; i++) {

      //             Set<Integer> s = new HashSet<>();
      //             for (int j = i; j < i + k; j++) {
      //                   s.add(arr[j]);
      //             }
      //             result.add(s.size());
      //       }

      //       return result;
      // }

      ArrayList<Integer> countDistinct(int arr[], int k) {
    int n = arr.length;
    ArrayList<Integer> result = new ArrayList<>();
    Map<Integer, Integer> map = new HashMap<>();

    // pehli window
    for (int i = 0; i < k; i++) {
        map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
    }
    result.add(map.size());

    // baaki windows
    for (int i = k; i < n; i++) {

        // element jo window se bahar ja raha hai
        int out = arr[i - k];
        map.put(out, map.get(out) - 1);
        if (map.get(out) == 0) {ddd
            map.remove(out);
        }

        // naya element jo window me aa raha hai
        int in = arr[i];
        map.put(in, map.getOrDefault(in, 0) + 1);

        result.add(map.size());
    }

    return result;
}


      public static void main(String[] args) {

      }
}
