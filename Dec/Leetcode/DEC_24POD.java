package Dec.Leetcode;

import java.util.*;

public class DEC_24POD {


//        public long maximumHappinessSum(int[] happiness, int k) {
//         Arrays.sort(happiness);
//         reverseArray(happiness);

//         long result = 0;
//         int count = 0;

//         for (int i = 0; i < k; i++) {
//             result += Math.max(happiness[i] - count, 0);
//             count++;
//         }

//         return result;
//     }

//     private void reverseArray(int[] arr) {
//         int start = 0;
//         int end = arr.length - 1;
//         while (start < end) {
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;
//             start++;
//             end--;
//         }
//     }



 public long maximumHappinessSum(int[] happiness, int k) {
        long result = 0;
        int count = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // max-heap

        for (int hap : happiness) {
            pq.offer(hap);
        }

        for (int i = 0; i < k; i++) {
            int hap = pq.poll();
            result += Math.max(hap - count, 0);
            count++;
        }

        return result;
    }
      public static void main(String[] args) {
            
      }
}
