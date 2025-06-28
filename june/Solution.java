import java.util.*;

public class Solution {

    public static ArrayList<Integer> countLessEq(int[] a, int[] b) {
        int[] sorted_b = new int[100001];

        // Frequency count of elements in b
        for (int i = 0; i < b.length; i++) {
            sorted_b[b[i]]++;
        }

        // Prefix sum to count <= operations
        for (int i = 1; i < 100001; i++) {
            sorted_b[i] += sorted_b[i - 1];
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            // If a[i] is larger than max value 100000, clamp it
            int val = (a[i] > 100000) ? 100000 : a[i];
            ans.add(sorted_b[val]);
        }

        return ans;
    }

    // Example usage
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 2, 3, 3, 3, 4};
        ArrayList<Integer> result = countLessEq(a, b);
        System.out.println(result); // Output: [1, 3, 6]
    }
}
 git commit -m "GFG-POD-28 "