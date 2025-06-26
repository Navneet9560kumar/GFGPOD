import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class GamewithString_27 {

    public static int minValue(String s, int k) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char ch : s.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Use max-heap (priority queue)
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int freq : freqMap.values()) {
            pq.add(freq);
        }

        // Step 3: Remove k characters
        while (k > 0 && !pq.isEmpty()) {
            int top = pq.poll();
            if (top > 1) {
                pq.add(top - 1);
            }
            // if top == 1, we just ignore it (no need to push back)
            k--;
        }

        // Step 4: Calculate final value
        int ans = 0;
        while (!pq.isEmpty()) {
            int freq = pq.poll();
            ans += freq * freq;
        }

        return ans;
    }

    public static void main(String[] args) {
        String s1 = "abbccc";
        int k1 = 2;
        System.out.println("Output: " + minValue(s1, k1)); // Output: 6

        String s2 = "aaab";
        int k2 = 2;
        System.out.println("Output: " + minValue(s2, k2)); // Output: 2
    }
}
