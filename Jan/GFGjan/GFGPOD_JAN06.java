package Jan.GFGjan;

import jul.maxCircularSubarryaSum;

public class GFGPOD_JAN06 {

//       public static int maxSubarrayXOR(int[] arr, int k) {
//     int n = arr.length;
//     int maxsum = Integer.MIN_VALUE;

//     for (int i = 0; i <= n - k; i++) {
//         int xor = 0;
//         for (int j = i; j < i + k; j++) {
//             xor = xor ^ arr[j];
//         }
//         maxsum = Math.max(maxsum, xor);
//     }
//     return maxsum;
// } run time error aa gaya

public static int maxSubarrayXOR(int[] arr, int k) {
    int n = arr.length;

    // First window
    int xor = 0;
    for (int i = 0; i < k; i++) {
        xor ^= arr[i];
    }

    int maxXor = xor;

    // Sliding window
    for (int i = k; i < n; i++) {
        xor = xor ^ arr[i] ^ arr[i - k];
        maxXor = Math.max(maxXor, xor);
    }

    return maxXor;
}


      public static void main(String[] args) {
            int[]arr= {2,5,8,1,1,3};
            int k = 3;
        System.out.println("The maxmum sub arr" + maxSubarrayXOR(arr, k));
      }
}
