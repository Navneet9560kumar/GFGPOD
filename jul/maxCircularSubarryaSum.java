package jul;

import java.util.*;

public class maxCircularSubarryaSum {


      
            public static int maxCircularSum(int arr[]) {
                  int n= arr.length;
                  // stpe 1 hai hamra le kadane algo for nor cricula case 
                  int maxNormal = kadane(arr);
                  
    // If all numbers are negative, return the max one (non-wrapping case
    if(maxNormal <0)
    return maxNormal;

    //step 2 Calculate sum of all elemnt
    int totalsum= 0;
    for(int i=0;i<n;i++){
      totalsum += arr[i];
      arr[i] = -arr[i];// Invert elemnt for min subarrya

    }
       // Step 3: Max circular = totalSum - (min subarray sum)
       int maxCircular =  totalsum + kadane(arr);

       return Math.max(maxNormal, maxCircular);

                  
    }


    private static int kadane(int[] arr){
      int maxEndingHere = arr[0],maxSorFar =arr[0];
      for(int i=1; i <arr.length;i++){
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSorFar = Math.max(maxSorFar,maxEndingHere);
      }
      return maxSorFar;
    }
     
     public static void main(String[] args) {
      
     } 
}







// 🔍 Kadane’s Algorithm kaha-kaha use hoti hai?
// 1. Maximum Subarray Sum (Classic Problem)
// Input: arr = [-2, 1, -3, 4, -1, 2, 1, -5, 4]

// Output: 6 (subarray: [4, -1, 2, 1])

// ✅ Kadane’s is made for this.

// 2. Maximum Circular Subarray Sum
// Input: arr = [8, -1, 3, 4]

// Output: 15 (subarray: [3, 4, 8])

// ✅ Kadane’s is used twice here — once for normal max sum, once for min sum.

// 3. Maximum Sum of K-Consecutive Elements
// Sometimes with modification (sliding window + kadane), it can be used when we want max sum of a subarray of fixed length k.

// 4. 2D Matrix Maximum Sum Submatrix
// Use Kadane’s in a nested loop to find max sum submatrix in a 2D array.

// Advanced use-case (used in image processing, data heatmaps).

// 5. Stock Market / Profit Problems
// Modified Kadane can be used to find:

// Best time to buy/sell stock (single transaction)

// Max profit with at most k transactions (with DP)

// 6. Dynamic Programming Base Case
// Kabhi-kabhi kadane’s ka concept DP state transition define karne ke liye base ban jata hai.

// Like in problems where you’re allowed to skip or include certain values under constraints.

// 7. Game Development / Score Tracking
// For tracking streaks, momentum, or combo scores — kadane logic helps find longest or highest scoring segment.

// 8. Signal Processing / Pattern Matching
// In data streams or signals, kadane helps to find strongest or cleanest sub-signals with max sum.

