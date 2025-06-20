import java.util.*;


public class GroupBall {

        public boolean validgroup(int[] arr, int k) {
        int n = arr.length;
        if (n % k != 0) return false; // Cannot divide into equal groups

        TreeMap<Integer, Integer> freq = new TreeMap<>();

        // Step 1: Count the frequency of each number
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Step 2: Try to form groups from the smallest number up
        for (int num : freq.keySet()) {
            int count = freq.get(num);
            if (count > 0) {
                // Try to make `count` groups starting from `num`
                for (int i = 0; i < k; i++) {
                    int current = num + i;
                    if (freq.getOrDefault(current, 0) < count) {
                        return false; // Not enough numbers to form group
                    }
                    freq.put(current, freq.get(current) - count); // Reduce the used count
                }
            }
        }

        return true; // All groups formed successfully
    }

    // Optional: main method to test
    public static void main(String[] args) {
        GroupBall sol = new GroupBall();

        System.out.println(sol.validgroup(new int[]{10, 1, 2, 11}, 2)); // true
        System.out.println(sol.validgroup(new int[]{7, 8, 9, 10, 11}, 2)); // false
    }
}
